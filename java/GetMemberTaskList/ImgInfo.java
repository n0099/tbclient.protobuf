package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
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

    private ImgInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
            }
            if (builder.jump_url == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = builder.jump_url;
                return;
            }
        }
        this.id = builder.id;
        this.type = builder.type;
        this.img_url = builder.img_url;
        this.jump_url = builder.jump_url;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ImgInfo> {
        public Integer id;
        public String img_url;
        public String jump_url;
        public Integer type;

        public Builder() {
        }

        public Builder(ImgInfo imgInfo) {
            super(imgInfo);
            if (imgInfo != null) {
                this.id = imgInfo.id;
                this.type = imgInfo.type;
                this.img_url = imgInfo.img_url;
                this.jump_url = imgInfo.jump_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ImgInfo build(boolean z) {
            return new ImgInfo(this, z);
        }
    }
}
