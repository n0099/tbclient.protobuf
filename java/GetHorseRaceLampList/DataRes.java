package tbclient.GetHorseRaceLampList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<LiveList> DEFAULT_LIVE_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<LiveList> live_list;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<LiveList> live_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.live_list = Message.copyOf(dataRes.live_list);
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
            List<LiveList> list = builder.live_list;
            if (list == null) {
                this.live_list = DEFAULT_LIVE_LIST;
                return;
            } else {
                this.live_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.live_list = Message.immutableCopyOf(builder.live_list);
    }
}
