@Service
public class StudentService {
    // Inject the repository
    @Autowired
    private StudentRepository studentRepository;

    private List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    private Student getStudentById(Long id) {
        return studentRepository.findAll(id);
    }

    private Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    private void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    private Student updateStudentName(Long id, String name) {
        Student student = studentRepository.findById(id);
        if (student) {
            student.setName(name);
            studentRepository.save(student);
            return student;
        }
    }
}