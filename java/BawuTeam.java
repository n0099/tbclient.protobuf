package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BawuTeam extends Message {
  public static final List<BawuRoleDes> DEFAULT_BAWU_TEAM_LIST;
  
  public static final Integer DEFAULT_TOTAL_NUM = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<BawuRoleDes> bawu_team_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer total_num;
  
  static {
    DEFAULT_BAWU_TEAM_LIST = Collections.emptyList();
  }
  
  public BawuTeam(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<BawuRoleDes> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.total_num;
      if (integer == null) {
        this.total_num = DEFAULT_TOTAL_NUM;
      } else {
        this.total_num = integer;
      } 
      list = paramBuilder.bawu_team_list;
      if (list == null) {
        this.bawu_team_list = DEFAULT_BAWU_TEAM_LIST;
      } else {
        this.bawu_team_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.total_num = ((Builder)list).total_num;
      this.bawu_team_list = Message.immutableCopyOf(((Builder)list).bawu_team_list);
    } 
  }
  
  public BawuTeam(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BawuTeam> {
    public List<BawuRoleDes> bawu_team_list;
    
    public Integer total_num;
    
    public Builder() {}
    
    public Builder(BawuTeam param1BawuTeam) {
      super(param1BawuTeam);
      if (param1BawuTeam == null)
        return; 
      this.total_num = param1BawuTeam.total_num;
      this.bawu_team_list = Message.copyOf(param1BawuTeam.bawu_team_list);
    }
    
    public BawuTeam build(boolean param1Boolean) {
      return new BawuTeam(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
