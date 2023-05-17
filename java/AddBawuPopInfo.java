package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class AddBawuPopInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AddBawuPopInfo> {
        public String content;
        public String img_url;
        public String jump_url;
        public String title;

        public Builder() {
        }

        public Builder(AddBawuPopInfo addBawuPopInfo) {
            super(addBawuPopInfo);
            if (addBawuPopInfo == null) {
                return;
            }
            this.title = addBawuPopInfo.title;
            this.content = addBawuPopInfo.content;
            this.img_url = addBawuPopInfo.img_url;
            this.jump_url = addBawuPopInfo.jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddBawuPopInfo build(boolean z) {
            return new AddBawuPopInfo(this, z);
        }
    }

    public AddBawuPopInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            String str3 = builder.img_url;
            if (str3 == null) {
                this.img_url = "";
            } else {
                this.img_url = str3;
            }
            String str4 = builder.jump_url;
            if (str4 == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = str4;
                return;
            }
        }
        this.title = builder.title;
        this.content = builder.content;
        this.img_url = builder.img_url;
        this.jump_url = builder.jump_url;
    }
}
