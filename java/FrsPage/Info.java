package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class Info extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<RecmForumInfo> recm_forum_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer user_num;
    public static final Integer DEFAULT_USER_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final List<RecmForumInfo> DEFAULT_RECM_FORUM_LIST = Collections.emptyList();

    private Info(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_num == null) {
                this.user_num = DEFAULT_USER_NUM;
            } else {
                this.user_num = builder.user_num;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.recm_forum_list == null) {
                this.recm_forum_list = DEFAULT_RECM_FORUM_LIST;
                return;
            } else {
                this.recm_forum_list = immutableCopyOf(builder.recm_forum_list);
                return;
            }
        }
        this.user_num = builder.user_num;
        this.post_num = builder.post_num;
        this.recm_forum_list = immutableCopyOf(builder.recm_forum_list);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Info> {
        public Integer post_num;
        public List<RecmForumInfo> recm_forum_list;
        public Integer user_num;

        public Builder() {
        }

        public Builder(Info info) {
            super(info);
            if (info != null) {
                this.user_num = info.user_num;
                this.post_num = info.post_num;
                this.recm_forum_list = Info.copyOf(info.recm_forum_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Info build(boolean z) {
            return new Info(this, z);
        }
    }
}
