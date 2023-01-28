package tbclient.RelateRecThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final List<ThreadInfo> DEFAULT_RECOM_THREAD_INFO = Collections.emptyList();
  
  public static final Integer DEFAULT_REC_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer rec_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> recom_thread_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<ThreadInfo> list = paramBuilder.recom_thread_info;
      if (list == null) {
        this.recom_thread_info = DEFAULT_RECOM_THREAD_INFO;
      } else {
        this.recom_thread_info = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.rec_type;
      if (integer == null) {
        this.rec_type = DEFAULT_REC_TYPE;
      } else {
        this.rec_type = integer;
      } 
    } else {
      this.recom_thread_info = Message.immutableCopyOf(((Builder)integer).recom_thread_info);
      this.rec_type = ((Builder)integer).rec_type;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer rec_type;
    
    public List<ThreadInfo> recom_thread_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.recom_thread_info = Message.copyOf(param1DataRes.recom_thread_info);
      this.rec_type = param1DataRes.rec_type;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
