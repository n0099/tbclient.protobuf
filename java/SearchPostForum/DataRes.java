package tbclient.SearchPostForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<SearchForum> DEFAULT_FUZZY_MATCH = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final SearchForum exact_match;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<SearchForum> fuzzy_match;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SearchForum> list;
    if (paramBoolean == true) {
      this.exact_match = paramBuilder.exact_match;
      list = paramBuilder.fuzzy_match;
      if (list == null) {
        this.fuzzy_match = DEFAULT_FUZZY_MATCH;
      } else {
        this.fuzzy_match = Message.immutableCopyOf(list);
      } 
    } else {
      this.exact_match = ((Builder)list).exact_match;
      this.fuzzy_match = Message.immutableCopyOf(((Builder)list).fuzzy_match);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public SearchForum exact_match;
    
    public List<SearchForum> fuzzy_match;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.exact_match = param1DataRes.exact_match;
      this.fuzzy_match = Message.copyOf(param1DataRes.fuzzy_match);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
