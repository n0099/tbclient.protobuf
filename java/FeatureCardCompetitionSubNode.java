package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeatureCardCompetitionSubNode extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_COMPETITION_IMAGE = "";
  
  public static final String DEFAULT_TEAM1_IMAGE = "";
  
  public static final String DEFAULT_TEAM1_NAME = "";
  
  public static final String DEFAULT_TEAM2_IMAGE = "";
  
  public static final String DEFAULT_TEAM2_NAME = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String competition_image;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String team1_image;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String team1_name;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String team2_image;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String team2_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public FeatureCardCompetitionSubNode(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.competition_image;
      if (str1 == null) {
        this.competition_image = "";
      } else {
        this.competition_image = str1;
      } 
      str1 = paramBuilder.team1_name;
      if (str1 == null) {
        this.team1_name = "";
      } else {
        this.team1_name = str1;
      } 
      str1 = paramBuilder.team1_image;
      if (str1 == null) {
        this.team1_image = "";
      } else {
        this.team1_image = str1;
      } 
      str1 = paramBuilder.team2_name;
      if (str1 == null) {
        this.team2_name = "";
      } else {
        this.team2_name = str1;
      } 
      str = paramBuilder.team2_image;
      if (str == null) {
        this.team2_image = "";
      } else {
        this.team2_image = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.url = ((Builder)str).url;
      this.competition_image = ((Builder)str).competition_image;
      this.team1_name = ((Builder)str).team1_name;
      this.team1_image = ((Builder)str).team1_image;
      this.team2_name = ((Builder)str).team2_name;
      this.team2_image = ((Builder)str).team2_image;
    } 
  }
  
  public FeatureCardCompetitionSubNode(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FeatureCardCompetitionSubNode> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String competition_image;
    
    public String team1_image;
    
    public String team1_name;
    
    public String team2_image;
    
    public String team2_name;
    
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(FeatureCardCompetitionSubNode param1FeatureCardCompetitionSubNode) {
      super(param1FeatureCardCompetitionSubNode);
      if (param1FeatureCardCompetitionSubNode == null)
        return; 
      this.title = param1FeatureCardCompetitionSubNode.title;
      this.url = param1FeatureCardCompetitionSubNode.url;
      this.competition_image = param1FeatureCardCompetitionSubNode.competition_image;
      this.team1_name = param1FeatureCardCompetitionSubNode.team1_name;
      this.team1_image = param1FeatureCardCompetitionSubNode.team1_image;
      this.team2_name = param1FeatureCardCompetitionSubNode.team2_name;
      this.team2_image = param1FeatureCardCompetitionSubNode.team2_image;
    }
    
    public FeatureCardCompetitionSubNode build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FeatureCardCompetitionSubNode)interceptResult.objValue; 
      } 
      return new FeatureCardCompetitionSubNode(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
