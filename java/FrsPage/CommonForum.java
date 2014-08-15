package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class CommonForum extends Message {
    public static final String DEFAULT_COMMON_FORUM = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String common_forum;

    /* synthetic */ CommonForum(Builder builder, boolean z, CommonForum commonForum) {
        this(builder, z);
    }

    private CommonForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.common_forum == null) {
                this.common_forum = "";
                return;
            } else {
                this.common_forum = builder.common_forum;
                return;
            }
        }
        this.common_forum = builder.common_forum;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<CommonForum> {
        public String common_forum;

        public Builder(CommonForum commonForum) {
            super(commonForum);
            if (commonForum != null) {
                this.common_forum = commonForum.common_forum;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonForum build(boolean z) {
            return new CommonForum(this, z, null);
        }
    }
}
