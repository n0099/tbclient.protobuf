package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ImgInfo extends Message {
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_JUMP_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_TYPE = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ImgInfo> {
        public Integer id;
        public String img_url;
        public String jump_url;
        public Integer type;

        public Builder() {
        }

        public Builder(ImgInfo imgInfo) {
            super(imgInfo);
            if (imgInfo == null) {
                return;
            }
            this.id = imgInfo.id;
            this.type = imgInfo.type;
            this.img_url = imgInfo.img_url;
            this.jump_url = imgInfo.jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ImgInfo build(boolean z) {
            return new ImgInfo(this, z);
        }
    }

    public ImgInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
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
        this.id = builder.id;
        this.type = builder.type;
        this.img_url = builder.img_url;
        this.jump_url = builder.jump_url;
    }
}
