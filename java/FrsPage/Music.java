package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Music extends Message {
  public static final Integer DEFAULT_ISOPEN;
  
  public static final Integer DEFAULT_NUM;
  
  public static final String DEFAULT_PIC = "";
  
  public static final Integer DEFAULT_SID;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer isopen;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer sid;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_NUM = integer;
    DEFAULT_SID = integer;
    DEFAULT_ISOPEN = integer;
  }
  
  public Music(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.pic;
      if (str == null) {
        this.pic = "";
      } else {
        this.pic = str;
      } 
      Integer integer1 = paramBuilder.num;
      if (integer1 == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer1;
      } 
      integer1 = paramBuilder.sid;
      if (integer1 == null) {
        this.sid = DEFAULT_SID;
      } else {
        this.sid = integer1;
      } 
      integer = paramBuilder.isopen;
      if (integer == null) {
        this.isopen = DEFAULT_ISOPEN;
      } else {
        this.isopen = integer;
      } 
    } else {
      this.pic = ((Builder)integer).pic;
      this.num = ((Builder)integer).num;
      this.sid = ((Builder)integer).sid;
      this.isopen = ((Builder)integer).isopen;
    } 
  }
  
  public Music(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Music> {
    public Integer isopen;
    
    public Integer num;
    
    public String pic;
    
    public Integer sid;
    
    public Builder() {}
    
    public Builder(Music param1Music) {
      super(param1Music);
      if (param1Music == null)
        return; 
      this.pic = param1Music.pic;
      this.num = param1Music.num;
      this.sid = param1Music.sid;
      this.isopen = param1Music.isopen;
    }
    
    public Music build(boolean param1Boolean) {
      return new Music(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
