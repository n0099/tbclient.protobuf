package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class RecomUserInfo extends Message {
    public static final String DEFAULT_MESSAGE = "";
    public static final String DEFAULT_POS_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<CommonForum> common_forum;
    @ProtoField(tag = 6)
    public final CommonDistance distanceinfo;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String message;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pos_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<PostInfo> post_info;
    @ProtoField(tag = 1)
    public final UserInfo user_info;
    public static final List<CommonForum> DEFAULT_COMMON_FORUM = Collections.emptyList();
    public static final List<PostInfo> DEFAULT_POST_INFO = Collections.emptyList();

    private RecomUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            if (builder.common_forum == null) {
                this.common_forum = DEFAULT_COMMON_FORUM;
            } else {
                this.common_forum = immutableCopyOf(builder.common_forum);
            }
            if (builder.post_info == null) {
                this.post_info = DEFAULT_POST_INFO;
            } else {
                this.post_info = immutableCopyOf(builder.post_info);
            }
            if (builder.pos_name == null) {
                this.pos_name = "";
            } else {
                this.pos_name = builder.pos_name;
            }
            if (builder.message == null) {
                this.message = "";
            } else {
                this.message = builder.message;
            }
            this.distanceinfo = builder.distanceinfo;
            return;
        }
        this.user_info = builder.user_info;
        this.common_forum = immutableCopyOf(builder.common_forum);
        this.post_info = immutableCopyOf(builder.post_info);
        this.pos_name = builder.pos_name;
        this.message = builder.message;
        this.distanceinfo = builder.distanceinfo;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RecomUserInfo> {
        public List<CommonForum> common_forum;
        public CommonDistance distanceinfo;
        public String message;
        public String pos_name;
        public List<PostInfo> post_info;
        public UserInfo user_info;

        public Builder() {
        }

        public Builder(RecomUserInfo recomUserInfo) {
            super(recomUserInfo);
            if (recomUserInfo != null) {
                this.user_info = recomUserInfo.user_info;
                this.common_forum = RecomUserInfo.copyOf(recomUserInfo.common_forum);
                this.post_info = RecomUserInfo.copyOf(recomUserInfo.post_info);
                this.pos_name = recomUserInfo.pos_name;
                this.message = recomUserInfo.message;
                this.distanceinfo = recomUserInfo.distanceinfo;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomUserInfo build(boolean z) {
            return new RecomUserInfo(this, z);
        }
    }
}
