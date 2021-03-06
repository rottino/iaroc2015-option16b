// GyroAdapter.java

/*
This software is part of the NxtJLib library.
It is Open Source Free Software, so you may
- run the code for any purpose
- study how the code works and adapt it to your needs
- integrate all or parts of the code in your own programs
- redistribute copies of the code
- improve the code and release your improvements to the public
However the use of the code is entirely your responsibility.
*/

package ch.aplu.nxt;


/**
 * Class with empty callback methods for the gyro sensor.
 */
public class GyroAdapter implements GyroListener
{
  /**
   * Empty method called when the gyro value overruns the trigger level.
   * Override it to process the event.
   * @param port the port where the sensor is plugged in
   * @param level the current gyro value.
   */
   public void fast(SensorPort port, int level)
   {}

   /**
   * Empty method called when the gyro value under-runs the trigger level.
   * Override it to process the event.
   * @param port the port where the sensor is plugged in
   * @param level the current gyro level
   */
   public void slow(SensorPort port, int level)
   {}
}
