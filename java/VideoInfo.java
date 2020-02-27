package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class VideoInfo extends Message {
    public static final String DEFAULT_MCN_LEAD_PAGE = "";
    public static final String DEFAULT_MEDIA_SUBTITLE = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";
    public static final String DEFAULT_VIDEO_MD5 = "";
    public static final String DEFAULT_VIDEO_URL = "";
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
    public static final Integer DEFAULT_VIDEO_DURATION = 0;
    public static final Integer DEFAULT_VIDEO_WIDTH = 0;
    public static final Integer DEFAULT_VIDEO_HEIGHT = 0;
    public static final Integer DEFAULT_THUMBNAIL_WIDTH = 0;
    public static final Integer DEFAULT_THUMBNAIL_HEIGHT = 0;
    public static final Integer DEFAULT_VIDEO_LENGTH = 0;
    public static final Integer DEFAULT_PLAY_COUNT = 0;
    public static final List<VideoDesc> DEFAULT_VIDEO_DESC = Collections.emptyList();
    public static final Integer DEFAULT_VIDEO_SELECT_FLAG = 0;
    public static final Integer DEFAULT_VIDEO_TYPE = 0;
    public static final Integer DEFAULT_IS_VERTICAL = 0;
    public static final Double DEFAULT_WTH_MID_LOC = Double.valueOf(0.0d);
    public static final Double DEFAULT_HTH_MID_LOC = Double.valueOf(0.0d);

    private VideoInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.video_md5 == null) {
                this.video_md5 = "";
            } else {
                this.video_md5 = builder.video_md5;
            }
            if (builder.video_url == null) {
                this.video_url = "";
            } else {
                this.video_url = builder.video_url;
            }
            if (builder.video_duration == null) {
                this.video_duration = DEFAULT_VIDEO_DURATION;
            } else {
                this.video_duration = builder.video_duration;
            }
            if (builder.video_width == null) {
                this.video_width = DEFAULT_VIDEO_WIDTH;
            } else {
                this.video_width = builder.video_width;
            }
            if (builder.video_height == null) {
                this.video_height = DEFAULT_VIDEO_HEIGHT;
            } else {
                this.video_height = builder.video_height;
            }
            if (builder.thumbnail_url == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = builder.thumbnail_url;
            }
            if (builder.thumbnail_width == null) {
                this.thumbnail_width = DEFAULT_THUMBNAIL_WIDTH;
            } else {
                this.thumbnail_width = builder.thumbnail_width;
            }
            if (builder.thumbnail_height == null) {
                this.thumbnail_height = DEFAULT_THUMBNAIL_HEIGHT;
            } else {
                this.thumbnail_height = builder.thumbnail_height;
            }
            if (builder.video_length == null) {
                this.video_length = DEFAULT_VIDEO_LENGTH;
            } else {
                this.video_length = builder.video_length;
            }
            if (builder.play_count == null) {
                this.play_count = DEFAULT_PLAY_COUNT;
            } else {
                this.play_count = builder.play_count;
            }
            if (builder.media_subtitle == null) {
                this.media_subtitle = "";
            } else {
                this.media_subtitle = builder.media_subtitle;
            }
            if (builder.video_desc == null) {
                this.video_desc = DEFAULT_VIDEO_DESC;
            } else {
                this.video_desc = immutableCopyOf(builder.video_desc);
            }
            if (builder.video_select_flag == null) {
                this.video_select_flag = DEFAULT_VIDEO_SELECT_FLAG;
            } else {
                this.video_select_flag = builder.video_select_flag;
            }
            if (builder.video_type == null) {
                this.video_type = DEFAULT_VIDEO_TYPE;
            } else {
                this.video_type = builder.video_type;
            }
            if (builder.is_vertical == null) {
                this.is_vertical = DEFAULT_IS_VERTICAL;
            } else {
                this.is_vertical = builder.is_vertical;
            }
            this.video_h265 = builder.video_h265;
            if (builder.mcn_lead_page == null) {
                this.mcn_lead_page = "";
            } else {
                this.mcn_lead_page = builder.mcn_lead_page;
            }
            this.mcn_ad_card = builder.mcn_ad_card;
            if (builder.wth_mid_loc == null) {
                this.wth_mid_loc = DEFAULT_WTH_MID_LOC;
            } else {
                this.wth_mid_loc = builder.wth_mid_loc;
            }
            if (builder.hth_mid_loc == null) {
                this.hth_mid_loc = DEFAULT_HTH_MID_LOC;
                return;
            } else {
                this.hth_mid_loc = builder.hth_mid_loc;
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
        this.video_desc = immutableCopyOf(builder.video_desc);
        this.video_select_flag = builder.video_select_flag;
        this.video_type = builder.video_type;
        this.is_vertical = builder.is_vertical;
        this.video_h265 = builder.video_h265;
        this.mcn_lead_page = builder.mcn_lead_page;
        this.mcn_ad_card = builder.mcn_ad_card;
        this.wth_mid_loc = builder.wth_mid_loc;
        this.hth_mid_loc = builder.hth_mid_loc;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VideoInfo> {
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
        }

        public Builder(VideoInfo videoInfo) {
            super(videoInfo);
            if (videoInfo != null) {
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
                this.video_desc = VideoInfo.copyOf(videoInfo.video_desc);
                this.video_select_flag = videoInfo.video_select_flag;
                this.video_type = videoInfo.video_type;
                this.is_vertical = videoInfo.is_vertical;
                this.video_h265 = videoInfo.video_h265;
                this.mcn_lead_page = videoInfo.mcn_lead_page;
                this.mcn_ad_card = videoInfo.mcn_ad_card;
                this.wth_mid_loc = videoInfo.wth_mid_loc;
                this.hth_mid_loc = videoInfo.hth_mid_loc;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoInfo build(boolean z) {
            return new VideoInfo(this, z);
        }
    }
}
