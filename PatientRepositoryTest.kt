import org.junit.Assert.assertEquals
import org.junit.Test

class PatientRepositoryTest {

    @Test
    fun shouldAddPatientSuccessfully() {
        val repository = PatientRepository()
        val patient = Patient("1", "João Silva", "99999-9999", "01/01/1990")

        repository.addPatient(patient)

        assertEquals(1, repository.getAllPatients().size)
    }
}
