package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class CommonForum extends Message {
    public static final String DEFAULT_FORUMNAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forumname;

    /* synthetic */ CommonForum(Builder builder, boolean z, CommonForum commonForum) {
        this(builder, z);
    }

    private CommonForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forumname == null) {
                this.forumname = "";
                return;
            } else {
                this.forumname = builder.forumname;
                return;
            }
        }
        this.forumname = builder.forumname;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<CommonForum> {
        public String forumname;

        public Builder(CommonForum commonForum) {
            super(commonForum);
            if (commonForum != null) {
                this.forumname = commonForum.forumname;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonForum build(boolean z) {
            return new CommonForum(this, z, null);
        }
    }
}
