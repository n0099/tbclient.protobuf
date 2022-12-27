package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class FeedGroupInfo extends Message {
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeedGroupInfo> {
        public String jump_url;
        public String name;

        public Builder() {
        }

        public Builder(FeedGroupInfo feedGroupInfo) {
            super(feedGroupInfo);
            if (feedGroupInfo == null) {
                return;
            }
            this.name = feedGroupInfo.name;
            this.jump_url = feedGroupInfo.jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedGroupInfo build(boolean z) {
            return new FeedGroupInfo(this, z);
        }
    }

    public FeedGroupInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = str2;
                return;
            }
        }
        this.name = builder.name;
        this.jump_url = builder.jump_url;
    }
}
