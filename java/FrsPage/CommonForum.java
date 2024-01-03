package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CommonForum extends Message {
    public static final String DEFAULT_COMMON_FORUM = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String common_forum;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CommonForum> {
        public String common_forum;

        public Builder() {
        }

        public Builder(CommonForum commonForum) {
            super(commonForum);
            if (commonForum == null) {
                return;
            }
            this.common_forum = commonForum.common_forum;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonForum build(boolean z) {
            return new CommonForum(this, z);
        }
    }

    public CommonForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.common_forum;
            if (str == null) {
                this.common_forum = "";
                return;
            } else {
                this.common_forum = str;
                return;
            }
        }
        this.common_forum = builder.common_forum;
    }
}
