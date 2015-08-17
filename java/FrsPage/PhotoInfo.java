package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PhotoInfo extends Message {
    public static final Integer DEFAULT_NUM = 0;
    public static final String DEFAULT_PIC = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer num;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic;

    /* synthetic */ PhotoInfo(Builder builder, boolean z, PhotoInfo photoInfo) {
        this(builder, z);
    }

    private PhotoInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pic == null) {
                this.pic = "";
            } else {
                this.pic = builder.pic;
            }
            if (builder.num == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = builder.num;
                return;
            }
        }
        this.pic = builder.pic;
        this.num = builder.num;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PhotoInfo> {
        public Integer num;
        public String pic;

        public Builder() {
        }

        public Builder(PhotoInfo photoInfo) {
            super(photoInfo);
            if (photoInfo != null) {
                this.pic = photoInfo.pic;
                this.num = photoInfo.num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PhotoInfo build(boolean z) {
            return new PhotoInfo(this, z, null);
        }
    }
}
