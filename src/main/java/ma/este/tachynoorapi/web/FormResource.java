package ma.este.tachynoorapi.web;

import ma.este.tachynoorapi.entities.*;
import ma.este.tachynoorapi.repository.FormRepository;
import ma.este.tachynoorapi.repository.OrderServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.*;

@RestController
public class FormResource {

    @Autowired
    private FormRepository formRepository;
    @Autowired
    private OrderServiceRepository orderServiceRepository;

    @PostMapping("/form")
    public Form createPerson(@RequestBody Form form) {
        OrderService orderService = orderServiceRepository.findByOrderNumber(form.getOrderService().getOrderNumber()).get();
        orderService.setCreateForm(true);
        form.setOrderService(orderService);
        form.setClient(orderService.getClient());
        form.setVehicle(orderService.getVehicle());

        return formRepository.save(form);
    }

    @DeleteMapping("/form/{id}")
    public ResponseEntity<String> deleteForm(@PathVariable Long id) {
        formRepository.deleteById(id);
        return ResponseEntity.ok("Form with ID " + id + " deleted successfully.");
    }
    @GetMapping("/form")
    public List<Form> getForms() {
        return formRepository.findAll();
    }

    @GetMapping("/form/{id}")
    public Form getForm(@PathVariable Long id){
        return formRepository.findById(id).get();
    }



    @PutMapping("/form/{id}")
    public Form updateForm(@PathVariable Long id, @RequestBody Form updatedForm) {
        Optional<Form> existingFormOptional = formRepository.findById(id);
        if (existingFormOptional.isPresent()) {

            Form existingForm = existingFormOptional.get();
            existingForm.setDate(updatedForm.getDate());
            existingForm.setFileNumber(updatedForm.getFileNumber());

            AdaptationCoeff existingAdaptationCoeff = existingForm.getAdaptationCoeff();
            AdaptationCoeff updatedAdaptationCoeff = updatedForm.getAdaptationCoeff();
            existingAdaptationCoeff.setCoeffientW(updatedAdaptationCoeff.getCoeffientW());
            existingAdaptationCoeff.setConstantK(updatedAdaptationCoeff.getConstantK());
            existingAdaptationCoeff.setCircumferenceL(updatedAdaptationCoeff.getCircumferenceL());

            SpeedAndActivityTest1 existingSpeedAndActivityTest1 = existingForm.getSpeedAndActivityTest1();
            SpeedAndActivityTest1 updatedSpeedAndActivityTest1 = updatedForm.getSpeedAndActivityTest1();
            existingSpeedAndActivityTest1.setChronoSpeed(updatedSpeedAndActivityTest1.getChronoSpeed());
            existingSpeedAndActivityTest1.setCompliant(updatedSpeedAndActivityTest1.isCompliant());
            existingSpeedAndActivityTest1.setGap(updatedSpeedAndActivityTest1.getGap());
            existingSpeedAndActivityTest1.setVariatorSpeed(updatedSpeedAndActivityTest1.getVariatorSpeed());

            SpeedAndActivityTest2 existingSpeedAndActivityTest2 = existingForm.getSpeedAndActivityTest2();
            SpeedAndActivityTest2 updatedSpeedAndActivityTest2 = updatedForm.getSpeedAndActivityTest2();
            existingSpeedAndActivityTest2.setChronoSpeed(updatedSpeedAndActivityTest2.getChronoSpeed());
            existingSpeedAndActivityTest2.setCompliant(updatedSpeedAndActivityTest2.isCompliant());
            existingSpeedAndActivityTest2.setGap(updatedSpeedAndActivityTest2.getGap());

            SpeedAndActivityTest3 existingSpeedAndActivityTest3 = existingForm.getSpeedAndActivityTest3();
            SpeedAndActivityTest3 updatedSpeedAndActivityTest3 = updatedForm.getSpeedAndActivityTest3();
            existingSpeedAndActivityTest3.setChronoSpeed(updatedSpeedAndActivityTest3.getChronoSpeed());
            existingSpeedAndActivityTest3.setCompliant(updatedSpeedAndActivityTest3.isCompliant());
            existingSpeedAndActivityTest3.setGap(updatedSpeedAndActivityTest3.getGap());

            SpeedAndActivityTest4 existingSpeedAndActivityTest4 = existingForm.getSpeedAndActivityTest4();
            SpeedAndActivityTest4 updatedSpeedAndActivityTest4 = updatedForm.getSpeedAndActivityTest4();
            existingSpeedAndActivityTest4.setChronoSpeed(updatedSpeedAndActivityTest4.getChronoSpeed());
            existingSpeedAndActivityTest4.setCompliant(updatedSpeedAndActivityTest4.isCompliant());
            existingSpeedAndActivityTest4.setGap(updatedSpeedAndActivityTest4.getGap());
            existingSpeedAndActivityTest4.setVariatorSpeed(updatedSpeedAndActivityTest4.getVariatorSpeed());

            SpeedAndActivityTest5 existingSpeedAndActivityTest5 = existingForm.getSpeedAndActivityTest5();
            SpeedAndActivityTest5 updatedSpeedAndActivityTest5 = updatedForm.getSpeedAndActivityTest5();
            existingSpeedAndActivityTest5.setChronoSpeed(updatedSpeedAndActivityTest5.getChronoSpeed());
            existingSpeedAndActivityTest5.setCompliant(updatedSpeedAndActivityTest5.isCompliant());
            existingSpeedAndActivityTest5.setGap(updatedSpeedAndActivityTest5.getGap());
            existingSpeedAndActivityTest5.setVariatorSpeed(updatedSpeedAndActivityTest5.getVariatorSpeed());

            SpeedAndActivityTest6 existingSpeedAndActivityTest6 = existingForm.getSpeedAndActivityTest6();
            SpeedAndActivityTest6 updatedSpeedAndActivityTest6 = updatedForm.getSpeedAndActivityTest6();
            existingSpeedAndActivityTest6.setChronoSpeed(updatedSpeedAndActivityTest6.getChronoSpeed());
            existingSpeedAndActivityTest6.setCompliant(updatedSpeedAndActivityTest6.isCompliant());
            existingSpeedAndActivityTest6.setGap(updatedSpeedAndActivityTest6.getGap());

            SpeedAndActivityTest7 existingSpeedAndActivityTest7 = existingForm.getSpeedAndActivityTest7();
            SpeedAndActivityTest7 updatedSpeedAndActivityTest7 = updatedForm.getSpeedAndActivityTest7();
            existingSpeedAndActivityTest7.setChronoSpeed(updatedSpeedAndActivityTest7.getChronoSpeed());
            existingSpeedAndActivityTest7.setCompliant(updatedSpeedAndActivityTest7.isCompliant());
            existingSpeedAndActivityTest7.setGap(updatedSpeedAndActivityTest7.getGap());

            ClockTest existingClockTest = existingForm.getClockTest();
            ClockTest updatedClockTest = updatedForm.getClockTest();
            existingClockTest.setCompliant(updatedClockTest.isCompliant());
            existingClockTest.setValue(updatedClockTest.getValue());
            existingClockTest.setGapSec(updatedClockTest.getGapSec());
            existingClockTest.setGapMin(updatedClockTest.getGapMin());


            Instrument existingInstrument = existingForm.getInstrument();
            Instrument updatedInstrument = updatedForm.getInstrument();
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


            Test1000m existingTest1000m = existingForm.getTest1000m();
            Test1000m updatedTest1000m = updatedForm.getTest1000m();
            existingTest1000m.setCompliantBanc(updatedTest1000m.isCompliantBanc());
            existingTest1000m.setCompliantChrono(updatedTest1000m.isCompliantChrono());
            existingTest1000m.setGapChrono(updatedTest1000m.getGapChrono());
            existingTest1000m.setGapBanc(updatedTest1000m.getGapBanc());
            existingTest1000m.setSpeedBanc(updatedTest1000m.getSpeedBanc());
            existingTest1000m.setSpeedChrono(updatedTest1000m.getSpeedChrono());
            existingTest1000m.setDistanceBanc(updatedTest1000m.getDistanceBanc());
            existingTest1000m.setDistanceChrono(updatedTest1000m.getDistanceChrono());


            NormalConditions exstingNormalConditions = existingForm.getNormalConditions();
            NormalConditions updatedNormalConditions = updatedForm.getNormalConditions();
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


            TestDistance existingTestDistance = existingForm.getTestDistance();
            TestDistance updatedTestDistance = updatedForm.getTestDistance();
            existingTestDistance.setTotalizerBefore(updatedTestDistance.getTotalizerBefore());
            existingTestDistance.setTotalizerAfter(updatedTestDistance.getTotalizerAfter());
            existingTestDistance.setBeforeAfter(updatedTestDistance.getBeforeAfter());
            existingTestDistance.setCompilant(updatedTestDistance.isCompilant());


            VerificationNormalConditions existingVerificationNormalConditions = existingForm.getVerificationNormalConditions();
            VerificationNormalConditions updatedVerificationNormalConditions = updatedForm.getVerificationNormalConditions();
            existingVerificationNormalConditions.setWearTire(updatedVerificationNormalConditions.isWearTire());
            existingVerificationNormalConditions.setVehicleState(updatedVerificationNormalConditions.isVehicleState());
            existingVerificationNormalConditions.setVehicleEmpty(updatedVerificationNormalConditions.isVehicleEmpty());
            existingVerificationNormalConditions.setPressureTire(updatedVerificationNormalConditions.isPressureTire());
            existingVerificationNormalConditions.setTemperature(updatedVerificationNormalConditions.isTemperature());
            existingVerificationNormalConditions.setFilling(updatedVerificationNormalConditions.isFilling());




            return formRepository.save(existingForm);

//
//            existingForm.setClient(updatedForm.getClient());
//            existingForm.setVehicle(updatedForm.getVehicle());
//            existingForm.setAdaptationCoeff(updatedForm.getAdaptationCoeff());
//            existingForm.setClockTest(updatedForm.getClockTest());
//            existingForm.setInstrument(updatedForm.getInstrument());
//            existingForm.setSpeedAndActivityTest(updatedForm.getSpeedAndActivityTest());
//            existingForm.setTest1000m(updatedForm.getTest1000m());
//            existingForm.setNormalConditions(updatedForm.getNormalConditions());
//            formRepository.save(existingForm);
//            return ResponseEntity.ok("Form with ID " + id + " updated successfully.");
        }
        return null;
    }





}

