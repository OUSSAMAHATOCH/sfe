package ma.este.tachynoorapi.web;


import ma.este.tachynoorapi.entities.*;
import ma.este.tachynoorapi.repository.OrderServiceRepository;
import ma.este.tachynoorapi.repository.PeriodicFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PeriodicFormResource {

    @Autowired
    PeriodicFormRepository periodicFormRepository;
    @Autowired
    private OrderServiceRepository orderServiceRepository;



    @PostMapping("/periodicForm")
    public PeriodicForm createPerson(@RequestBody PeriodicForm periodicForm) {
        OrderService orderService = orderServiceRepository.findByOrderNumber(periodicForm.getOrderService().getOrderNumber()).get();
        orderService.setCreateForm(true);
        periodicForm.setOrderService(orderService);
        periodicForm.setClient(orderService.getClient());
        periodicForm.setVehicle(orderService.getVehicle());
        return periodicFormRepository.save(periodicForm);
    }

    @DeleteMapping("/periodicForm/{id}")
    public ResponseEntity<String> deletePeriodicForm(@PathVariable Long id) {
        periodicFormRepository.deleteById(id);
        return ResponseEntity.ok("Form with ID " + id + " deleted successfully.");
    }
    @GetMapping("/periodicForm")
    public List<PeriodicForm> getPeriodicForm() {
        return periodicFormRepository.findAll();
    }

    @GetMapping("/periodicForm/{id}")
    public PeriodicForm getPeriodicForm(@PathVariable Long id){
        return periodicFormRepository.findById(id).get();
    }

    @PutMapping("/periodicForm/{id}")
    public ResponseEntity<String> updateForm(@PathVariable Long id, @RequestBody PeriodicForm updatedPeriodicForm) {
        Optional<PeriodicForm> existingPeriodicFormOptional = periodicFormRepository.findById(id);
        if (existingPeriodicFormOptional.isPresent()) {

            PeriodicForm existingPeriodicForm = existingPeriodicFormOptional.get();
            existingPeriodicForm.setDate(updatedPeriodicForm.getDate());
            existingPeriodicForm.setFileNumber(updatedPeriodicForm.getFileNumber());

            AdaptationCoeff existingAdaptationCoeff = existingPeriodicForm.getAdaptationCoeff();
            AdaptationCoeff updatedAdaptationCoeff = updatedPeriodicForm.getAdaptationCoeff();
            existingAdaptationCoeff.setCoeffientW(updatedAdaptationCoeff.getCoeffientW());
            existingAdaptationCoeff.setConstantK(updatedAdaptationCoeff.getConstantK());
            existingAdaptationCoeff.setCircumferenceL(updatedAdaptationCoeff.getCircumferenceL());


            ClockTest existingClockTest = existingPeriodicForm.getClockTest();
            ClockTest updatedClockTest = updatedPeriodicForm.getClockTest();
            existingClockTest.setCompliant(updatedClockTest.isCompliant());
            existingClockTest.setValue(updatedClockTest.getValue());
            existingClockTest.setGapSec(updatedClockTest.getGapSec());
            existingClockTest.setGapMin(updatedClockTest.getGapMin());


            Instrument existingInstrument = existingPeriodicForm.getInstrument();
            Instrument updatedInstrument = updatedPeriodicForm.getInstrument();
            existingInstrument.setBrand(updatedInstrument.getBrand());
            existingInstrument.setType(updatedInstrument.getType());
            existingInstrument.setFilling(updatedInstrument.isFilling());
            existingInstrument.setApprovalNumber(updatedInstrument.getApprovalNumber());
            existingInstrument.setModel(updatedInstrument.getModel());
            existingInstrument.setSerieNumber(updatedInstrument.getSerieNumber());
            existingInstrument.setVoltage(updatedInstrument.isVoltage());
            existingInstrument.setVmax(updatedInstrument.getVmax());
            existingInstrument.setW(updatedInstrument.getW());
            existingInstrument.setW1(updatedInstrument.getW1());
            existingInstrument.setW2(updatedInstrument.getW2());
            existingInstrument.setW3(updatedInstrument.getW3());
            existingInstrument.setLo(updatedInstrument.getLo());
            existingInstrument.setLg(updatedInstrument.getLg());
            existingInstrument.setLmay(updatedInstrument.getLmay());
            existingInstrument.setConstantK(updatedInstrument.getConstantK());
            existingInstrument.setManufactureYear(updatedInstrument.getManufactureYear());
            existingInstrument.setApproval(updatedInstrument.getApproval());



            Test1000m existingTest1000m = existingPeriodicForm.getTest1000m();
            Test1000m updatedTest1000m = updatedPeriodicForm.getTest1000m();
            existingTest1000m.setCompliantBanc(updatedTest1000m.isCompliantBanc());
            existingTest1000m.setCompliantChrono(updatedTest1000m.isCompliantChrono());
            existingTest1000m.setGapChrono(updatedTest1000m.getGapChrono());
            existingTest1000m.setGapBanc(updatedTest1000m.getGapBanc());
            existingTest1000m.setSpeedBanc(updatedTest1000m.getSpeedBanc());
            existingTest1000m.setSpeedChrono(updatedTest1000m.getSpeedChrono());
            existingTest1000m.setDistanceBanc(updatedTest1000m.getDistanceBanc());
            existingTest1000m.setDistanceChrono(updatedTest1000m.getDistanceChrono());

            NormalConditions exstingNormalConditions = existingPeriodicForm.getNormalConditions();
            NormalConditions updatedNormalConditions = updatedPeriodicForm.getNormalConditions();
            exstingNormalConditions.setWearTireGInt(updatedNormalConditions.getWearTireGInt());
            exstingNormalConditions.setWearTireGExt(updatedNormalConditions.getWearTireGExt());
            exstingNormalConditions.setWearTireDInt(updatedNormalConditions.getWearTireDInt());
            exstingNormalConditions.setWearTireDExt(updatedNormalConditions.getWearTireDExt());
            exstingNormalConditions.setVehicleState(updatedNormalConditions.isVehicleState());
            exstingNormalConditions.setVehicleEmpty(updatedNormalConditions.isVehicleEmpty());
            exstingNormalConditions.setTireBrand(updatedNormalConditions.getTireBrand());
            exstingNormalConditions.setTemperature(updatedNormalConditions.getTemperature());
            exstingNormalConditions.setPressureTireGInt(updatedNormalConditions.getPressureTireGInt());
            exstingNormalConditions.setPressureTireGExt(updatedNormalConditions.getPressureTireGExt());
            exstingNormalConditions.setPressureTireDInt(updatedNormalConditions.getPressureTireDInt());
            exstingNormalConditions.setPressureTireDExt(updatedNormalConditions.getPressureTireDExt());
            exstingNormalConditions.setDimension(updatedNormalConditions.getDimension());


            TestDistance existingTestDistance = existingPeriodicForm.getTestDistance();
            TestDistance updatedTestDistance = updatedPeriodicForm.getTestDistance();
            existingTestDistance.setTotalizerBefore(updatedTestDistance.getTotalizerBefore());
            existingTestDistance.setTotalizerAfter(updatedTestDistance.getTotalizerAfter());
            existingTestDistance.setBeforeAfter(updatedTestDistance.getBeforeAfter());
            existingTestDistance.setCompilant(updatedTestDistance.isCompilant());







            periodicFormRepository.save(existingPeriodicForm);







        }
        return null;


    }}
