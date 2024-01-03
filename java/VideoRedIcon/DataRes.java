package tbclient.VideoRedIcon;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final List<RedIcon> DEFAULT_RED_ICON_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RedIcon> red_icon_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<RedIcon> red_icon_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.red_icon_list = Message.copyOf(dataRes.red_icon_list);
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
            List<RedIcon> list = builder.red_icon_list;
            if (list == null) {
                this.red_icon_list = DEFAULT_RED_ICON_LIST;
                return;
            } else {
                this.red_icon_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.red_icon_list = Message.immutableCopyOf(builder.red_icon_list);
    }
}
