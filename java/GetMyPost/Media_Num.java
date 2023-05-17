package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class Media_Num extends Message {
    public static final Integer DEFAULT_PIC = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer pic;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Media_Num> {
        public Integer pic;

        public Builder() {
        }

        public Builder(Media_Num media_Num) {
            super(media_Num);
            if (media_Num == null) {
                return;
            }
            this.pic = media_Num.pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Media_Num build(boolean z) {
            return new Media_Num(this, z);
        }
    }

    public Media_Num(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.pic;
            if (num == null) {
                this.pic = DEFAULT_PIC;
                return;
            } else {
                this.pic = num;
                return;
            }
        }
        this.pic = builder.pic;
    }
}
