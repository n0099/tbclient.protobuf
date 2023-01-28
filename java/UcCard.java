package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class UcCard extends Message {
  public static final String DEFAULT_DOC = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_JMP = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final List<UcCardInfo> DEFAULT_UC_CARDS = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String doc;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jmp;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<UcCardInfo> uc_cards;
  
  public UcCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<UcCardInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
      str = paramBuilder.doc;
      if (str == null) {
        this.doc = "";
      } else {
        this.doc = str;
      } 
      str = paramBuilder.jmp;
      if (str == null) {
        this.jmp = "";
      } else {
        this.jmp = str;
      } 
      list = paramBuilder.uc_cards;
      if (list == null) {
        this.uc_cards = DEFAULT_UC_CARDS;
      } else {
        this.uc_cards = Message.immutableCopyOf(list);
      } 
    } else {
      this.name = ((Builder)list).name;
      this.icon = ((Builder)list).icon;
      this.doc = ((Builder)list).doc;
      this.jmp = ((Builder)list).jmp;
      this.uc_cards = Message.immutableCopyOf(((Builder)list).uc_cards);
    } 
  }
  
  public UcCard(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UcCard> {
    public String doc;
    
    public String icon;
    
    public String jmp;
    
    public String name;
    
    public List<UcCardInfo> uc_cards;
    
    public Builder() {}
    
    public Builder(UcCard param1UcCard) {
      super(param1UcCard);
      if (param1UcCard == null)
        return; 
      this.name = param1UcCard.name;
      this.icon = param1UcCard.icon;
      this.doc = param1UcCard.doc;
      this.jmp = param1UcCard.jmp;
      this.uc_cards = Message.copyOf(param1UcCard.uc_cards);
    }
    
    public UcCard build(boolean param1Boolean) {
      return new UcCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
