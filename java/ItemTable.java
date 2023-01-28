package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ItemTable extends Message {
  public static final Integer DEFAULT_COMMENT_STAR;
  
  public static final Integer DEFAULT_IS_COMMENTED;
  
  public static final List<ItemPlot> DEFAULT_ITEM_PLOT;
  
  public static final List<ItemPoint> DEFAULT_ITEM_POINT;
  
  public static final Integer DEFAULT_TOTAL_POINT_NUM;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer comment_star;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_commented;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<ItemPlot> item_plot;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<ItemPoint> item_point;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer total_point_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_COMMENTED = integer;
    DEFAULT_COMMENT_STAR = integer;
    DEFAULT_TOTAL_POINT_NUM = integer;
    DEFAULT_ITEM_POINT = Collections.emptyList();
    DEFAULT_ITEM_PLOT = Collections.emptyList();
  }
  
  public ItemTable(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ItemPlot> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_commented;
      if (integer == null) {
        this.is_commented = DEFAULT_IS_COMMENTED;
      } else {
        this.is_commented = integer;
      } 
      integer = paramBuilder.comment_star;
      if (integer == null) {
        this.comment_star = DEFAULT_COMMENT_STAR;
      } else {
        this.comment_star = integer;
      } 
      integer = paramBuilder.total_point_num;
      if (integer == null) {
        this.total_point_num = DEFAULT_TOTAL_POINT_NUM;
      } else {
        this.total_point_num = integer;
      } 
      List<ItemPoint> list1 = paramBuilder.item_point;
      if (list1 == null) {
        this.item_point = DEFAULT_ITEM_POINT;
      } else {
        this.item_point = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.item_plot;
      if (list == null) {
        this.item_plot = DEFAULT_ITEM_PLOT;
      } else {
        this.item_plot = Message.immutableCopyOf(list);
      } 
    } else {
      this.is_commented = ((Builder)list).is_commented;
      this.comment_star = ((Builder)list).comment_star;
      this.total_point_num = ((Builder)list).total_point_num;
      this.item_point = Message.immutableCopyOf(((Builder)list).item_point);
      this.item_plot = Message.immutableCopyOf(((Builder)list).item_plot);
    } 
  }
  
  public ItemTable(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemTable> {
    public Integer comment_star;
    
    public Integer is_commented;
    
    public List<ItemPlot> item_plot;
    
    public List<ItemPoint> item_point;
    
    public Integer total_point_num;
    
    public Builder() {}
    
    public Builder(ItemTable param1ItemTable) {
      super(param1ItemTable);
      if (param1ItemTable == null)
        return; 
      this.is_commented = param1ItemTable.is_commented;
      this.comment_star = param1ItemTable.comment_star;
      this.total_point_num = param1ItemTable.total_point_num;
      this.item_point = Message.copyOf(param1ItemTable.item_point);
      this.item_plot = Message.copyOf(param1ItemTable.item_plot);
    }
    
    public ItemTable build(boolean param1Boolean) {
      return new ItemTable(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
