package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Anti;
import tbclient.DealWindow;
import tbclient.DynamicInfo;
import tbclient.Feedback;
import tbclient.ForumDynamic;
import tbclient.Highlist;
import tbclient.PostInfoList;
import tbclient.TbBookrack;
import tbclient.UcCard;
import tbclient.User;
import tbclient.UserManChannelInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2)
    public final Anti anti_stat;
    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<ForumDynamic> concerned_forum_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<DynamicInfo> dynamic_list;
    @ProtoField(tag = 10)
    public final Feedback feedback;
    @ProtoField(tag = 7)
    public final Highlist highs;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<PostInfoList> post_list;
    @ProtoField(tag = 3)
    public final TAInfo tainfo;
    @ProtoField(tag = 9)
    public final TbBookrack tbbookrack;
    @ProtoField(tag = 6)
    public final UcCard uc_card;
    @ProtoField(tag = 1)
    public final User user;
    @ProtoField(tag = 5)
    public final UserGodInfo user_god_info;
    @ProtoField(tag = 11)
    public final UserManChannelInfo video_channel_info;
    @ProtoField(tag = 8)
    public final DealWindow window;
    public static final List<PostInfoList> DEFAULT_POST_LIST = Collections.emptyList();
    public static final List<DynamicInfo> DEFAULT_DYNAMIC_LIST = Collections.emptyList();
    public static final List<ForumDynamic> DEFAULT_CONCERNED_FORUM_LIST = Collections.emptyList();

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
            this.anti_stat = builder.anti_stat;
            this.tainfo = builder.tainfo;
            if (builder.post_list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = immutableCopyOf(builder.post_list);
            }
            this.user_god_info = builder.user_god_info;
            this.uc_card = builder.uc_card;
            this.highs = builder.highs;
            this.window = builder.window;
            this.tbbookrack = builder.tbbookrack;
            this.feedback = builder.feedback;
            this.video_channel_info = builder.video_channel_info;
            if (builder.dynamic_list == null) {
                this.dynamic_list = DEFAULT_DYNAMIC_LIST;
            } else {
                this.dynamic_list = immutableCopyOf(builder.dynamic_list);
            }
            if (builder.concerned_forum_list == null) {
                this.concerned_forum_list = DEFAULT_CONCERNED_FORUM_LIST;
                return;
            } else {
                this.concerned_forum_list = immutableCopyOf(builder.concerned_forum_list);
                return;
            }
        }
        this.user = builder.user;
        this.anti_stat = builder.anti_stat;
        this.tainfo = builder.tainfo;
        this.post_list = immutableCopyOf(builder.post_list);
        this.user_god_info = builder.user_god_info;
        this.uc_card = builder.uc_card;
        this.highs = builder.highs;
        this.window = builder.window;
        this.tbbookrack = builder.tbbookrack;
        this.feedback = builder.feedback;
        this.video_channel_info = builder.video_channel_info;
        this.dynamic_list = immutableCopyOf(builder.dynamic_list);
        this.concerned_forum_list = immutableCopyOf(builder.concerned_forum_list);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Anti anti_stat;
        public List<ForumDynamic> concerned_forum_list;
        public List<DynamicInfo> dynamic_list;
        public Feedback feedback;
        public Highlist highs;
        public List<PostInfoList> post_list;
        public TAInfo tainfo;
        public TbBookrack tbbookrack;
        public UcCard uc_card;
        public User user;
        public UserGodInfo user_god_info;
        public UserManChannelInfo video_channel_info;
        public DealWindow window;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user = dataRes.user;
                this.anti_stat = dataRes.anti_stat;
                this.tainfo = dataRes.tainfo;
                this.post_list = DataRes.copyOf(dataRes.post_list);
                this.user_god_info = dataRes.user_god_info;
                this.uc_card = dataRes.uc_card;
                this.highs = dataRes.highs;
                this.window = dataRes.window;
                this.tbbookrack = dataRes.tbbookrack;
                this.feedback = dataRes.feedback;
                this.video_channel_info = dataRes.video_channel_info;
                this.dynamic_list = DataRes.copyOf(dataRes.dynamic_list);
                this.concerned_forum_list = DataRes.copyOf(dataRes.concerned_forum_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
