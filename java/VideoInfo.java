package tbclient;

import androidx.core.view.InputDeviceCompat;
import com.baidu.android.imsdk.internal.Constants;
import com.baidu.mobads.container.util.AdIconUtil;
import com.baidu.tbadk.core.util.TiebaStatic;
import com.baidu.tieba.recapp.activity.AdWebVideoActivityConfig;
import com.baidu.tieba.tbadkCore.videoupload.VideoFinishResult;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class VideoInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Double DEFAULT_HTH_MID_LOC;
    public static final Integer DEFAULT_IS_VERTICAL;
    public static final String DEFAULT_MCN_LEAD_PAGE = "";
    public static final String DEFAULT_MEDIA_SUBTITLE = "";
    public static final Integer DEFAULT_PLAY_COUNT;
    public static final Integer DEFAULT_THUMBNAIL_HEIGHT;
    public static final String DEFAULT_THUMBNAIL_URL = "";
    public static final Integer DEFAULT_THUMBNAIL_WIDTH;
    public static final List<VideoDesc> DEFAULT_VIDEO_DESC;
    public static final Integer DEFAULT_VIDEO_DURATION;
    public static final Integer DEFAULT_VIDEO_HEIGHT;
    public static final Integer DEFAULT_VIDEO_LENGTH;
    public static final String DEFAULT_VIDEO_MD5 = "";
    public static final Integer DEFAULT_VIDEO_SELECT_FLAG;
    public static final Integer DEFAULT_VIDEO_TYPE;
    public static final String DEFAULT_VIDEO_URL = "";
    public static final Integer DEFAULT_VIDEO_WIDTH;
    public static final Double DEFAULT_WTH_MID_LOC;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 20, type = Message.Datatype.DOUBLE)
    public final Double hth_mid_loc;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer is_vertical;
    @ProtoField(tag = 18)
    public final McnAdInfo mcn_ad_card;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String mcn_lead_page;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String media_subtitle;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer play_count;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer thumbnail_height;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String thumbnail_url;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer thumbnail_width;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<VideoDesc> video_desc;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer video_duration;
    @ProtoField(tag = 16)
    public final VideoDesc video_h265;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer video_height;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer video_length;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String video_md5;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer video_select_flag;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer video_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String video_url;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer video_width;
    @ProtoField(tag = 19, type = Message.Datatype.DOUBLE)
    public final Double wth_mid_loc;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<VideoInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Double hth_mid_loc;
        public Integer is_vertical;
        public McnAdInfo mcn_ad_card;
        public String mcn_lead_page;
        public String media_subtitle;
        public Integer play_count;
        public Integer thumbnail_height;
        public String thumbnail_url;
        public Integer thumbnail_width;
        public List<VideoDesc> video_desc;
        public Integer video_duration;
        public VideoDesc video_h265;
        public Integer video_height;
        public Integer video_length;
        public String video_md5;
        public Integer video_select_flag;
        public Integer video_type;
        public String video_url;
        public Integer video_width;
        public Double wth_mid_loc;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(VideoInfo videoInfo) {
            super(videoInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {videoInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (videoInfo == null) {
                return;
            }
            this.video_md5 = videoInfo.video_md5;
            this.video_url = videoInfo.video_url;
            this.video_duration = videoInfo.video_duration;
            this.video_width = videoInfo.video_width;
            this.video_height = videoInfo.video_height;
            this.thumbnail_url = videoInfo.thumbnail_url;
            this.thumbnail_width = videoInfo.thumbnail_width;
            this.thumbnail_height = videoInfo.thumbnail_height;
            this.video_length = videoInfo.video_length;
            this.play_count = videoInfo.play_count;
            this.media_subtitle = videoInfo.media_subtitle;
            this.video_desc = Message.copyOf(videoInfo.video_desc);
            this.video_select_flag = videoInfo.video_select_flag;
            this.video_type = videoInfo.video_type;
            this.is_vertical = videoInfo.is_vertical;
            this.video_h265 = videoInfo.video_h265;
            this.mcn_lead_page = videoInfo.mcn_lead_page;
            this.mcn_ad_card = videoInfo.mcn_ad_card;
            this.wth_mid_loc = videoInfo.wth_mid_loc;
            this.hth_mid_loc = videoInfo.hth_mid_loc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new VideoInfo(this, z, null) : (VideoInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-339395076, "Ltbclient/VideoInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-339395076, "Ltbclient/VideoInfo;");
                return;
            }
        }
        DEFAULT_VIDEO_DURATION = 0;
        DEFAULT_VIDEO_WIDTH = 0;
        DEFAULT_VIDEO_HEIGHT = 0;
        DEFAULT_THUMBNAIL_WIDTH = 0;
        DEFAULT_THUMBNAIL_HEIGHT = 0;
        DEFAULT_VIDEO_LENGTH = 0;
        DEFAULT_PLAY_COUNT = 0;
        DEFAULT_VIDEO_DESC = Collections.emptyList();
        DEFAULT_VIDEO_SELECT_FLAG = 0;
        DEFAULT_VIDEO_TYPE = 0;
        DEFAULT_IS_VERTICAL = 0;
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_WTH_MID_LOC = valueOf;
        DEFAULT_HTH_MID_LOC = valueOf;
    }

    public /* synthetic */ VideoInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    public static VideoInfo parseFromJson(JSONObject jSONObject) {
        InterceptResult invokeL;
        Interceptable interceptable = $ic;
        if (interceptable == null || (invokeL = interceptable.invokeL(InputDeviceCompat.SOURCE_TRACKBALL, null, jSONObject)) == null) {
            if (jSONObject == null) {
                return null;
            }
            Builder builder = new Builder();
            builder.video_md5 = jSONObject.optString(VideoFinishResult.KEY_VIDEO_MD5);
            builder.video_url = jSONObject.optString("video_url");
            builder.video_duration = Integer.valueOf(jSONObject.optInt(AdWebVideoActivityConfig.KEY_VIDEO_DURATION));
            builder.video_width = Integer.valueOf(jSONObject.optInt("video_width"));
            builder.video_height = Integer.valueOf(jSONObject.optInt("video_height"));
            builder.thumbnail_url = jSONObject.optString("thumbnail_url");
            builder.thumbnail_width = Integer.valueOf(jSONObject.optInt("thumbnail_width"));
            builder.thumbnail_height = Integer.valueOf(jSONObject.optInt("thumbnail_height"));
            builder.video_length = Integer.valueOf(jSONObject.optInt("video_length"));
            builder.play_count = Integer.valueOf(jSONObject.optInt("play_count"));
            builder.media_subtitle = jSONObject.optString("media_subtitle");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("video_desc");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(VideoDesc.parseFromJson(optJSONArray.optJSONObject(i2)));
                }
                builder.video_desc = arrayList;
            }
            builder.video_select_flag = Integer.valueOf(jSONObject.optInt("video_select_flag"));
            builder.video_type = Integer.valueOf(jSONObject.optInt("video_type"));
            builder.is_vertical = Integer.valueOf(jSONObject.optInt(TiebaStatic.Params.IS_VERTICAL));
            builder.video_h265 = VideoDesc.parseFromJson(jSONObject.optJSONObject("video_h265"));
            builder.mcn_lead_page = jSONObject.optString("mcn_lead_page");
            builder.mcn_ad_card = McnAdInfo.parseFromJson(jSONObject.optJSONObject("mcn_ad_card"));
            builder.wth_mid_loc = Double.valueOf(jSONObject.optDouble("wth_mid_loc"));
            builder.hth_mid_loc = Double.valueOf(jSONObject.optDouble("hth_mid_loc"));
            return builder.build(false);
        }
        return (VideoInfo) invokeL.objValue;
    }

    public static JSONObject toJson(VideoInfo videoInfo) {
        InterceptResult invokeL;
        Interceptable interceptable = $ic;
        if (interceptable == null || (invokeL = interceptable.invokeL(AdIconUtil.AD_TEXT_ID, null, videoInfo)) == null) {
            if (videoInfo == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(VideoFinishResult.KEY_VIDEO_MD5, videoInfo.video_md5);
                jSONObject.put("video_url", videoInfo.video_url);
                jSONObject.put(AdWebVideoActivityConfig.KEY_VIDEO_DURATION, videoInfo.video_duration);
                jSONObject.put("video_width", videoInfo.video_width);
                jSONObject.put("video_height", videoInfo.video_height);
                jSONObject.put("thumbnail_url", videoInfo.thumbnail_url);
                jSONObject.put("thumbnail_width", videoInfo.thumbnail_width);
                jSONObject.put("thumbnail_height", videoInfo.thumbnail_height);
                jSONObject.put("video_length", videoInfo.video_length);
                jSONObject.put("play_count", videoInfo.play_count);
                jSONObject.put("media_subtitle", videoInfo.media_subtitle);
                JSONArray jSONArray = new JSONArray();
                for (VideoDesc videoDesc : videoInfo.video_desc) {
                    jSONArray.put(VideoDesc.toJson(videoDesc));
                }
                jSONObject.put("video_desc", jSONArray);
                jSONObject.put("video_select_flag", videoInfo.video_select_flag);
                jSONObject.put("video_type", videoInfo.video_type);
                jSONObject.put(TiebaStatic.Params.IS_VERTICAL, videoInfo.is_vertical);
                jSONObject.put("video_h265", VideoDesc.toJson(videoInfo.video_h265));
                jSONObject.put("mcn_lead_page", videoInfo.mcn_lead_page);
                jSONObject.put("mcn_ad_card", McnAdInfo.toJson(videoInfo.mcn_ad_card));
                jSONObject.put("wth_mid_loc", videoInfo.wth_mid_loc);
                jSONObject.put("hth_mid_loc", videoInfo.hth_mid_loc);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }
        return (JSONObject) invokeL.objValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.video_md5;
            if (str == null) {
                this.video_md5 = "";
            } else {
                this.video_md5 = str;
            }
            String str2 = builder.video_url;
            if (str2 == null) {
                this.video_url = "";
            } else {
                this.video_url = str2;
            }
            Integer num = builder.video_duration;
            if (num == null) {
                this.video_duration = DEFAULT_VIDEO_DURATION;
            } else {
                this.video_duration = num;
            }
            Integer num2 = builder.video_width;
            if (num2 == null) {
                this.video_width = DEFAULT_VIDEO_WIDTH;
            } else {
                this.video_width = num2;
            }
            Integer num3 = builder.video_height;
            if (num3 == null) {
                this.video_height = DEFAULT_VIDEO_HEIGHT;
            } else {
                this.video_height = num3;
            }
            String str3 = builder.thumbnail_url;
            if (str3 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str3;
            }
            Integer num4 = builder.thumbnail_width;
            if (num4 == null) {
                this.thumbnail_width = DEFAULT_THUMBNAIL_WIDTH;
            } else {
                this.thumbnail_width = num4;
            }
            Integer num5 = builder.thumbnail_height;
            if (num5 == null) {
                this.thumbnail_height = DEFAULT_THUMBNAIL_HEIGHT;
            } else {
                this.thumbnail_height = num5;
            }
            Integer num6 = builder.video_length;
            if (num6 == null) {
                this.video_length = DEFAULT_VIDEO_LENGTH;
            } else {
                this.video_length = num6;
            }
            Integer num7 = builder.play_count;
            if (num7 == null) {
                this.play_count = DEFAULT_PLAY_COUNT;
            } else {
                this.play_count = num7;
            }
            String str4 = builder.media_subtitle;
            if (str4 == null) {
                this.media_subtitle = "";
            } else {
                this.media_subtitle = str4;
            }
            List<VideoDesc> list = builder.video_desc;
            if (list == null) {
                this.video_desc = DEFAULT_VIDEO_DESC;
            } else {
                this.video_desc = Message.immutableCopyOf(list);
            }
            Integer num8 = builder.video_select_flag;
            if (num8 == null) {
                this.video_select_flag = DEFAULT_VIDEO_SELECT_FLAG;
            } else {
                this.video_select_flag = num8;
            }
            Integer num9 = builder.video_type;
            if (num9 == null) {
                this.video_type = DEFAULT_VIDEO_TYPE;
            } else {
                this.video_type = num9;
            }
            Integer num10 = builder.is_vertical;
            if (num10 == null) {
                this.is_vertical = DEFAULT_IS_VERTICAL;
            } else {
                this.is_vertical = num10;
            }
            this.video_h265 = builder.video_h265;
            String str5 = builder.mcn_lead_page;
            if (str5 == null) {
                this.mcn_lead_page = "";
            } else {
                this.mcn_lead_page = str5;
            }
            this.mcn_ad_card = builder.mcn_ad_card;
            Double d2 = builder.wth_mid_loc;
            if (d2 == null) {
                this.wth_mid_loc = DEFAULT_WTH_MID_LOC;
            } else {
                this.wth_mid_loc = d2;
            }
            Double d3 = builder.hth_mid_loc;
            if (d3 == null) {
                this.hth_mid_loc = DEFAULT_HTH_MID_LOC;
                return;
            } else {
                this.hth_mid_loc = d3;
                return;
            }
        }
        this.video_md5 = builder.video_md5;
        this.video_url = builder.video_url;
        this.video_duration = builder.video_duration;
        this.video_width = builder.video_width;
        this.video_height = builder.video_height;
        this.thumbnail_url = builder.thumbnail_url;
        this.thumbnail_width = builder.thumbnail_width;
        this.thumbnail_height = builder.thumbnail_height;
        this.video_length = builder.video_length;
        this.play_count = builder.play_count;
        this.media_subtitle = builder.media_subtitle;
        this.video_desc = Message.immutableCopyOf(builder.video_desc);
        this.video_select_flag = builder.video_select_flag;
        this.video_type = builder.video_type;
        this.is_vertical = builder.is_vertical;
        this.video_h265 = builder.video_h265;
        this.mcn_lead_page = builder.mcn_lead_page;
        this.mcn_ad_card = builder.mcn_ad_card;
        this.wth_mid_loc = builder.wth_mid_loc;
        this.hth_mid_loc = builder.hth_mid_loc;
    }
}
