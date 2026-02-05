class PatientRepository {

    private val patients = mutableListOf<Patient>()

    fun addPatient(patient: Patient) {
        patients.add(patient)
    }

    fun getAllPatients(): List<Patient> {
        return patients
    }
}
