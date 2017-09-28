package tbclient.Personal;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.DealWindow;
import tbclient.DynamicInfo;
import tbclient.ForumDynamic;
import tbclient.Profile.UserGodInfo;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ForumDynamic> concerned_forum_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<DynamicInfo> dynamic_list;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer mask_type;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 1)
    public final User user;
    @ProtoField(tag = 7)
    public final UserGodInfo user_god_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> video_page;
    @ProtoField(tag = 8)
    public final DealWindow window;
    public static final List<ThreadInfo> DEFAULT_VIDEO_PAGE = Collections.emptyList();
    public static final List<DynamicInfo> DEFAULT_DYNAMIC_LIST = Collections.emptyList();
    public static final List<ForumDynamic> DEFAULT_CONCERNED_FORUM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_MASK_TYPE = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
            if (builder.video_page == null) {
                this.video_page = DEFAULT_VIDEO_PAGE;
            } else {
                this.video_page = immutableCopyOf(builder.video_page);
            }
            if (builder.dynamic_list == null) {
                this.dynamic_list = DEFAULT_DYNAMIC_LIST;
            } else {
                this.dynamic_list = immutableCopyOf(builder.dynamic_list);
            }
            if (builder.concerned_forum_list == null) {
                this.concerned_forum_list = DEFAULT_CONCERNED_FORUM_LIST;
            } else {
                this.concerned_forum_list = immutableCopyOf(builder.concerned_forum_list);
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            this.user_god_info = builder.user_god_info;
            this.window = builder.window;
            if (builder.mask_type == null) {
                this.mask_type = DEFAULT_MASK_TYPE;
                return;
            } else {
                this.mask_type = builder.mask_type;
                return;
            }
        }
        this.user = builder.user;
        this.video_page = immutableCopyOf(builder.video_page);
        this.dynamic_list = immutableCopyOf(builder.dynamic_list);
        this.concerned_forum_list = immutableCopyOf(builder.concerned_forum_list);
        this.pn = builder.pn;
        this.has_more = builder.has_more;
        this.user_god_info = builder.user_god_info;
        this.window = builder.window;
        this.mask_type = builder.mask_type;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ForumDynamic> concerned_forum_list;
        public List<DynamicInfo> dynamic_list;
        public Integer has_more;
        public Integer mask_type;
        public Integer pn;
        public User user;
        public UserGodInfo user_god_info;
        public List<ThreadInfo> video_page;
        public DealWindow window;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user = dataRes.user;
                this.video_page = DataRes.copyOf(dataRes.video_page);
                this.dynamic_list = DataRes.copyOf(dataRes.dynamic_list);
                this.concerned_forum_list = DataRes.copyOf(dataRes.concerned_forum_list);
                this.pn = dataRes.pn;
                this.has_more = dataRes.has_more;
                this.user_god_info = dataRes.user_god_info;
                this.window = dataRes.window;
                this.mask_type = dataRes.mask_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
