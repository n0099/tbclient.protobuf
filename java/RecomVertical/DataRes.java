package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final Integer DEFAULT_NEED_RECHOOSE;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final List<ThreadPersonalized> DEFAULT_THREAD_PERSONALIZED = Collections.emptyList();
  
  @ProtoField(tag = 4)
  public final ClassInfo class_info;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer need_rechoose;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ThreadPersonalized> thread_personalized;
  
  static {
    DEFAULT_NEED_RECHOOSE = Integer.valueOf(0);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<ThreadInfo> list1 = paramBuilder.thread_list;
      if (list1 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list1);
      } 
      List<ThreadPersonalized> list = paramBuilder.thread_personalized;
      if (list == null) {
        this.thread_personalized = DEFAULT_THREAD_PERSONALIZED;
      } else {
        this.thread_personalized = Message.immutableCopyOf(list);
      } 
      this.class_info = paramBuilder.class_info;
      integer = paramBuilder.need_rechoose;
      if (integer == null) {
        this.need_rechoose = DEFAULT_NEED_RECHOOSE;
      } else {
        this.need_rechoose = integer;
      } 
    } else {
      this.thread_list = Message.immutableCopyOf(((Builder)integer).thread_list);
      this.thread_personalized = Message.immutableCopyOf(((Builder)integer).thread_personalized);
      this.class_info = ((Builder)integer).class_info;
      this.need_rechoose = ((Builder)integer).need_rechoose;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public ClassInfo class_info;
    
    public Integer need_rechoose;
    
    public List<ThreadInfo> thread_list;
    
    public List<ThreadPersonalized> thread_personalized;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.thread_list = Message.copyOf(param1DataRes.thread_list);
      this.thread_personalized = Message.copyOf(param1DataRes.thread_personalized);
      this.class_info = param1DataRes.class_info;
      this.need_rechoose = param1DataRes.need_rechoose;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
