package tbclient.GetHorseRaceLampList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final List<LiveList> DEFAULT_LIVE_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<LiveList> live_list;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.live_list == null) {
                this.live_list = DEFAULT_LIVE_LIST;
                return;
            } else {
                this.live_list = immutableCopyOf(builder.live_list);
                return;
            }
        }
        this.live_list = immutableCopyOf(builder.live_list);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<LiveList> live_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.live_list = DataRes.copyOf(dataRes.live_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
