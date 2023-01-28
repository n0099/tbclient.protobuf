package tbclient.BazhuGrade;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class GradeDesc extends Message {
  public static final String DEFAULT_GRADE = "";
  
  public static final Integer DEFAULT_POINT = Integer.valueOf(0);
  
  public static final List<GradeRight> DEFAULT_RIGHTS = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String grade;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer point;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<GradeRight> rights;
  
  public GradeDesc(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<GradeRight> list;
    if (paramBoolean == true) {
      String str = paramBuilder.grade;
      if (str == null) {
        this.grade = "";
      } else {
        this.grade = str;
      } 
      Integer integer = paramBuilder.point;
      if (integer == null) {
        this.point = DEFAULT_POINT;
      } else {
        this.point = integer;
      } 
      list = paramBuilder.rights;
      if (list == null) {
        this.rights = DEFAULT_RIGHTS;
      } else {
        this.rights = Message.immutableCopyOf(list);
      } 
    } else {
      this.grade = ((Builder)list).grade;
      this.point = ((Builder)list).point;
      this.rights = Message.immutableCopyOf(((Builder)list).rights);
    } 
  }
  
  public GradeDesc(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GradeDesc> {
    public String grade;
    
    public Integer point;
    
    public List<GradeRight> rights;
    
    public Builder() {}
    
    public Builder(GradeDesc param1GradeDesc) {
      super(param1GradeDesc);
      if (param1GradeDesc == null)
        return; 
      this.grade = param1GradeDesc.grade;
      this.point = param1GradeDesc.point;
      this.rights = Message.copyOf(param1GradeDesc.rights);
    }
    
    public GradeDesc build(boolean param1Boolean) {
      return new GradeDesc(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
