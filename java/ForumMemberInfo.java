package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class ForumMemberInfo extends Message {
    public static final List<User> DEFAULT_MEMBER_LIST = Collections.emptyList();
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TOTAL = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<User> member_list;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String total;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ForumMemberInfo> {
        public List<User> member_list;
        public String title;
        public String total;

        public Builder() {
        }

        public Builder(ForumMemberInfo forumMemberInfo) {
            super(forumMemberInfo);
            if (forumMemberInfo == null) {
                return;
            }
            this.total = forumMemberInfo.total;
            this.title = forumMemberInfo.title;
            this.member_list = Message.copyOf(forumMemberInfo.member_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumMemberInfo build(boolean z) {
            return new ForumMemberInfo(this, z);
        }
    }

    public ForumMemberInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.total;
            if (str == null) {
                this.total = "";
            } else {
                this.total = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            List<User> list = builder.member_list;
            if (list == null) {
                this.member_list = DEFAULT_MEMBER_LIST;
                return;
            } else {
                this.member_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.total = builder.total;
        this.title = builder.title;
        this.member_list = Message.immutableCopyOf(builder.member_list);
    }
}
