package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final Banner banner;
    @ProtoField(tag = 10)
    public final Discover discover;
    @ProtoField(tag = 7)
    public final FunCenter fun_center;
    @ProtoField(tag = 9)
    public final HotActivity hot_activity;
    @ProtoField(tag = 6)
    public final HotForum hot_forum;
    @ProtoField(tag = 2)
    public final HotGod hot_god;
    @ProtoField(tag = 12)
    public final HotThread hot_thread;
    @ProtoField(tag = 5)
    public final HotTopic hot_topic;
    @ProtoField(tag = 4)
    public final HotTwzbThread hot_twzb;
    @ProtoField(tag = 3)
    public final HotVideo hot_video;
    @ProtoField(tag = 11)
    public final UserModule user_module;
    @ProtoField(tag = 8)
    public final VipCenter vip_center;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.banner = builder.banner;
            this.hot_god = builder.hot_god;
            this.hot_video = builder.hot_video;
            this.hot_twzb = builder.hot_twzb;
            this.hot_topic = builder.hot_topic;
            this.hot_forum = builder.hot_forum;
            this.fun_center = builder.fun_center;
            this.vip_center = builder.vip_center;
            this.hot_activity = builder.hot_activity;
            this.discover = builder.discover;
            this.user_module = builder.user_module;
            this.hot_thread = builder.hot_thread;
            return;
        }
        this.banner = builder.banner;
        this.hot_god = builder.hot_god;
        this.hot_video = builder.hot_video;
        this.hot_twzb = builder.hot_twzb;
        this.hot_topic = builder.hot_topic;
        this.hot_forum = builder.hot_forum;
        this.fun_center = builder.fun_center;
        this.vip_center = builder.vip_center;
        this.hot_activity = builder.hot_activity;
        this.discover = builder.discover;
        this.user_module = builder.user_module;
        this.hot_thread = builder.hot_thread;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Banner banner;
        public Discover discover;
        public FunCenter fun_center;
        public HotActivity hot_activity;
        public HotForum hot_forum;
        public HotGod hot_god;
        public HotThread hot_thread;
        public HotTopic hot_topic;
        public HotTwzbThread hot_twzb;
        public HotVideo hot_video;
        public UserModule user_module;
        public VipCenter vip_center;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.banner = dataRes.banner;
                this.hot_god = dataRes.hot_god;
                this.hot_video = dataRes.hot_video;
                this.hot_twzb = dataRes.hot_twzb;
                this.hot_topic = dataRes.hot_topic;
                this.hot_forum = dataRes.hot_forum;
                this.fun_center = dataRes.fun_center;
                this.vip_center = dataRes.vip_center;
                this.hot_activity = dataRes.hot_activity;
                this.discover = dataRes.discover;
                this.user_module = dataRes.user_module;
                this.hot_thread = dataRes.hot_thread;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
