package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ClassInfo extends Message {
  public static final Integer DEFAULT_CLASS_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final List<SubClassItem> DEFAULT_SUB_CLASS_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer class_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<SubClassItem> sub_class_list;
  
  public ClassInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SubClassItem> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.class_id;
      if (integer == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer;
      } 
      String str = paramBuilder.class_name;
      if (str == null) {
        this.class_name = "";
      } else {
        this.class_name = str;
      } 
      list = paramBuilder.sub_class_list;
      if (list == null) {
        this.sub_class_list = DEFAULT_SUB_CLASS_LIST;
      } else {
        this.sub_class_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.class_id = ((Builder)list).class_id;
      this.class_name = ((Builder)list).class_name;
      this.sub_class_list = Message.immutableCopyOf(((Builder)list).sub_class_list);
    } 
  }
  
  public ClassInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ClassInfo> {
    public Integer class_id;
    
    public String class_name;
    
    public List<SubClassItem> sub_class_list;
    
    public Builder() {}
    
    public Builder(ClassInfo param1ClassInfo) {
      super(param1ClassInfo);
      if (param1ClassInfo == null)
        return; 
      this.class_id = param1ClassInfo.class_id;
      this.class_name = param1ClassInfo.class_name;
      this.sub_class_list = Message.copyOf(param1ClassInfo.sub_class_list);
    }
    
    public ClassInfo build(boolean param1Boolean) {
      return new ClassInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
