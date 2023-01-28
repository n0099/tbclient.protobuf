package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<ResponseTagInfo> DEFAULT_SEX_TAGLIST = Collections.emptyList();
  
  public static final List<ResponseTagInfo> DEFAULT_TAGLIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ResponseTagInfo> sex_taglist;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ResponseTagInfo> taglist;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ResponseTagInfo> list;
    if (paramBoolean == true) {
      List<ResponseTagInfo> list1 = paramBuilder.sex_taglist;
      if (list1 == null) {
        this.sex_taglist = DEFAULT_SEX_TAGLIST;
      } else {
        this.sex_taglist = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.taglist;
      if (list == null) {
        this.taglist = DEFAULT_TAGLIST;
      } else {
        this.taglist = Message.immutableCopyOf(list);
      } 
    } else {
      this.sex_taglist = Message.immutableCopyOf(((Builder)list).sex_taglist);
      this.taglist = Message.immutableCopyOf(((Builder)list).taglist);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<ResponseTagInfo> sex_taglist;
    
    public List<ResponseTagInfo> taglist;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.sex_taglist = Message.copyOf(param1DataRes.sex_taglist);
      this.taglist = Message.copyOf(param1DataRes.taglist);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
