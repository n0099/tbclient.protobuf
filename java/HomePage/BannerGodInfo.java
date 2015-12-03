package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class BannerGodInfo extends Message {
    public static final String DEFAULT_AVATOR = "";
    public static final String DEFAULT_GOD_INTRO = "";
    public static final String DEFAULT_THREAD_ABSTRACT = "";
    public static final String DEFAULT_THREAD_TITLE = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String avator;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String god_intro;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String thread_abstract;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
    public final List<String> thread_pics;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String thread_title;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_UID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final List<String> DEFAULT_THREAD_PICS = Collections.emptyList();

    /* synthetic */ BannerGodInfo(Builder builder, boolean z, BannerGodInfo bannerGodInfo) {
        this(builder, z);
    }

    private BannerGodInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.avator == null) {
                this.avator = "";
            } else {
                this.avator = builder.avator;
            }
            if (builder.god_intro == null) {
                this.god_intro = "";
            } else {
                this.god_intro = builder.god_intro;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.thread_title == null) {
                this.thread_title = "";
            } else {
                this.thread_title = builder.thread_title;
            }
            if (builder.thread_abstract == null) {
                this.thread_abstract = "";
            } else {
                this.thread_abstract = builder.thread_abstract;
            }
            if (builder.thread_pics == null) {
                this.thread_pics = DEFAULT_THREAD_PICS;
            } else {
                this.thread_pics = immutableCopyOf(builder.thread_pics);
            }
            if (builder.user_name == null) {
                this.user_name = "";
                return;
            } else {
                this.user_name = builder.user_name;
                return;
            }
        }
        this.uid = builder.uid;
        this.avator = builder.avator;
        this.god_intro = builder.god_intro;
        this.thread_id = builder.thread_id;
        this.thread_title = builder.thread_title;
        this.thread_abstract = builder.thread_abstract;
        this.thread_pics = immutableCopyOf(builder.thread_pics);
        this.user_name = builder.user_name;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BannerGodInfo> {
        public String avator;
        public String god_intro;
        public String thread_abstract;
        public Long thread_id;
        public List<String> thread_pics;
        public String thread_title;
        public Long uid;
        public String user_name;

        public Builder() {
        }

        public Builder(BannerGodInfo bannerGodInfo) {
            super(bannerGodInfo);
            if (bannerGodInfo != null) {
                this.uid = bannerGodInfo.uid;
                this.avator = bannerGodInfo.avator;
                this.god_intro = bannerGodInfo.god_intro;
                this.thread_id = bannerGodInfo.thread_id;
                this.thread_title = bannerGodInfo.thread_title;
                this.thread_abstract = bannerGodInfo.thread_abstract;
                this.thread_pics = BannerGodInfo.copyOf(bannerGodInfo.thread_pics);
                this.user_name = bannerGodInfo.user_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerGodInfo build(boolean z) {
            return new BannerGodInfo(this, z, null);
        }
    }
}
