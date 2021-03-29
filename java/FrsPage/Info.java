package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Info> {
        public Integer post_num;
        public List<RecmForumInfo> recm_forum_list;
        public Integer user_num;

        public Builder() {
        }

        public Builder(Info info) {
            super(info);
            if (info == null) {
                return;
            }
            this.user_num = info.user_num;
            this.post_num = info.post_num;
            this.recm_forum_list = Message.copyOf(info.recm_forum_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Info build(boolean z) {
            return new Info(this, z);
        }
    }

    public Info(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.user_num;
            if (num == null) {
                this.user_num = DEFAULT_USER_NUM;
            } else {
                this.user_num = num;
            }
            Integer num2 = builder.post_num;
            if (num2 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num2;
            }
            List<RecmForumInfo> list = builder.recm_forum_list;
            if (list == null) {
                this.recm_forum_list = DEFAULT_RECM_FORUM_LIST;
                return;
            } else {
                this.recm_forum_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.user_num = builder.user_num;
        this.post_num = builder.post_num;
        this.recm_forum_list = Message.immutableCopyOf(builder.recm_forum_list);
    }
}
