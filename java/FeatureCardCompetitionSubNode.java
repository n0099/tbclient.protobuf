import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FeatureCardCompetitionSubNode;

public final class FeatureCardCompetitionSubNode extends Message {
  public static final String DEFAULT_COMPETITION_IMAGE = "";
  
  public static final String DEFAULT_TEAM1_IMAGE = "";
  
  public static final String DEFAULT_TEAM1_NAME = "";
  
  public static final String DEFAULT_TEAM2_IMAGE = "";
  
  public static final String DEFAULT_TEAM2_NAME = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
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
    super((Message.Builder)paramBuilder);
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
}
