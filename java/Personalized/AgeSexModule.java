package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class AgeSexModule extends Message {
  public static final List<TagStruct> DEFAULT_AGE_TAG;
  
  public static final List<TagStruct> DEFAULT_SEX_TAG = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<TagStruct> age_tag;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<TagStruct> sex_tag;
  
  static {
    DEFAULT_AGE_TAG = Collections.emptyList();
  }
  
  public AgeSexModule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<TagStruct> list;
    if (paramBoolean == true) {
      List<TagStruct> list1 = paramBuilder.sex_tag;
      if (list1 == null) {
        this.sex_tag = DEFAULT_SEX_TAG;
      } else {
        this.sex_tag = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.age_tag;
      if (list == null) {
        this.age_tag = DEFAULT_AGE_TAG;
      } else {
        this.age_tag = Message.immutableCopyOf(list);
      } 
    } else {
      this.sex_tag = Message.immutableCopyOf(((Builder)list).sex_tag);
      this.age_tag = Message.immutableCopyOf(((Builder)list).age_tag);
    } 
  }
  
  public AgeSexModule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AgeSexModule> {
    public List<TagStruct> age_tag;
    
    public List<TagStruct> sex_tag;
    
    public Builder() {}
    
    public Builder(AgeSexModule param1AgeSexModule) {
      super(param1AgeSexModule);
      if (param1AgeSexModule == null)
        return; 
      this.sex_tag = Message.copyOf(param1AgeSexModule.sex_tag);
      this.age_tag = Message.copyOf(param1AgeSexModule.age_tag);
    }
    
    public AgeSexModule build(boolean param1Boolean) {
      return new AgeSexModule(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
