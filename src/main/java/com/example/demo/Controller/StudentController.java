@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity<students, HttpStatus.OK>
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        if (student) {
            return ResponseEntity<student, HttpStatus.OK>
        } else {
            return ResponseEntity<"Studnet not found", HttpStatus.NOT_FOUND>
        }
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student newStudent = studentServicde.createStudent();
    }

    @PostMapping("/{id}")
    public ResponseEntity<Student> updateStudentName(@PathVariable Long id, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudentName(id, student.getName());
        if (updatedStudent) {
            return ResponseEntity<updatedStudent, HttpStatus.OK>
        } else {
            return ResponseEntity<"Student not found", HttpStatus.NOT_FOUND>
        }        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity<"Student deleted successfully">;
    }
}