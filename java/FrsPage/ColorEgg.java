package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ColorEgg extends Message {
  public static final List<String> DEFAULT_HOLIDAY_WORDS = Collections.emptyList();
  
  public static final Integer DEFAULT_STYLE_FLAG = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> holiday_words;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer style_flag;
  
  public ColorEgg(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<String> list = paramBuilder.holiday_words;
      if (list == null) {
        this.holiday_words = DEFAULT_HOLIDAY_WORDS;
      } else {
        this.holiday_words = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.style_flag;
      if (integer == null) {
        this.style_flag = DEFAULT_STYLE_FLAG;
      } else {
        this.style_flag = integer;
      } 
    } else {
      this.holiday_words = Message.immutableCopyOf(((Builder)integer).holiday_words);
      this.style_flag = ((Builder)integer).style_flag;
    } 
  }
  
  public ColorEgg(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ColorEgg> {
    public List<String> holiday_words;
    
    public Integer style_flag;
    
    public Builder() {}
    
    public Builder(ColorEgg param1ColorEgg) {
      super(param1ColorEgg);
      if (param1ColorEgg == null)
        return; 
      this.holiday_words = Message.copyOf(param1ColorEgg.holiday_words);
      this.style_flag = param1ColorEgg.style_flag;
    }
    
    public ColorEgg build(boolean param1Boolean) {
      return new ColorEgg(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
