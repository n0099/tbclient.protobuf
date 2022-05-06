package FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FrsPage.StarSchedule;

public final class ClientPlatform extends Message {
  public static final String DEFAULT_SCHEDULE_CAL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String schedule_cal;
  
  @ProtoField(tag = 2)
  public final StarSchedule star_schedule;
  
  public ClientPlatform(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.schedule_cal;
      if (str == null) {
        this.schedule_cal = "";
      } else {
        this.schedule_cal = str;
      } 
      this.star_schedule = paramBuilder.star_schedule;
    } else {
      this.schedule_cal = paramBuilder.schedule_cal;
      this.star_schedule = paramBuilder.star_schedule;
    } 
  }
}
