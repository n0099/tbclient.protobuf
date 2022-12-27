package tbclient.GetSticker;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final List<String> DEFAULT_PIC_INFO = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> pic_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<String> pic_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.pic_info = Message.copyOf(dataRes.pic_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<String> list = builder.pic_info;
            if (list == null) {
                this.pic_info = DEFAULT_PIC_INFO;
                return;
            } else {
                this.pic_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.pic_info = Message.immutableCopyOf(builder.pic_info);
    }
}
