package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class PrivatePopInfo extends Message {
    public static final String DEFAULT_POP_CONTENT = "";
    public static final String DEFAULT_POP_TYPE = "";
    public static final String DEFAULT_POP_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer day;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pop_content;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pop_forum_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pop_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pop_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_POP_FORUM_ID = 0;
    public static final Integer DEFAULT_DAY = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<PrivatePopInfo> {
        public Integer day;
        public String pop_content;
        public Integer pop_forum_id;
        public String pop_type;
        public String pop_url;
        public String title;

        public Builder() {
        }

        public Builder(PrivatePopInfo privatePopInfo) {
            super(privatePopInfo);
            if (privatePopInfo == null) {
                return;
            }
            this.pop_type = privatePopInfo.pop_type;
            this.pop_content = privatePopInfo.pop_content;
            this.pop_url = privatePopInfo.pop_url;
            this.pop_forum_id = privatePopInfo.pop_forum_id;
            this.title = privatePopInfo.title;
            this.day = privatePopInfo.day;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivatePopInfo build(boolean z) {
            return new PrivatePopInfo(this, z);
        }
    }

    public PrivatePopInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.pop_type;
            if (str == null) {
                this.pop_type = "";
            } else {
                this.pop_type = str;
            }
            String str2 = builder.pop_content;
            if (str2 == null) {
                this.pop_content = "";
            } else {
                this.pop_content = str2;
            }
            String str3 = builder.pop_url;
            if (str3 == null) {
                this.pop_url = "";
            } else {
                this.pop_url = str3;
            }
            Integer num = builder.pop_forum_id;
            if (num == null) {
                this.pop_forum_id = DEFAULT_POP_FORUM_ID;
            } else {
                this.pop_forum_id = num;
            }
            String str4 = builder.title;
            if (str4 == null) {
                this.title = "";
            } else {
                this.title = str4;
            }
            Integer num2 = builder.day;
            if (num2 == null) {
                this.day = DEFAULT_DAY;
                return;
            } else {
                this.day = num2;
                return;
            }
        }
        this.pop_type = builder.pop_type;
        this.pop_content = builder.pop_content;
        this.pop_url = builder.pop_url;
        this.pop_forum_id = builder.pop_forum_id;
        this.title = builder.title;
        this.day = builder.day;
    }
}
