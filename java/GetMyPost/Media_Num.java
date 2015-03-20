package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Media_Num extends Message {
    public static final Integer DEFAULT_PIC = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer pic;

    /* synthetic */ Media_Num(Builder builder, boolean z, Media_Num media_Num) {
        this(builder, z);
    }

    private Media_Num(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pic == null) {
                this.pic = DEFAULT_PIC;
                return;
            } else {
                this.pic = builder.pic;
                return;
            }
        }
        this.pic = builder.pic;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<Media_Num> {
        public Integer pic;

        public Builder(Media_Num media_Num) {
            super(media_Num);
            if (media_Num != null) {
                this.pic = media_Num.pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Media_Num build(boolean z) {
            return new Media_Num(this, z, null);
        }
    }
}