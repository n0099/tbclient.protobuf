package tbclient.GetMutilGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<AdvInfo> adv_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<GameInfo> game_list;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;
    public static final List<GameInfo> DEFAULT_GAME_LIST = Collections.emptyList();
    public static final List<AdvInfo> DEFAULT_ADV_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.game_list == null) {
                this.game_list = DEFAULT_GAME_LIST;
            } else {
                this.game_list = immutableCopyOf(builder.game_list);
            }
            if (builder.adv_list == null) {
                this.adv_list = DEFAULT_ADV_LIST;
            } else {
                this.adv_list = immutableCopyOf(builder.adv_list);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.game_list = immutableCopyOf(builder.game_list);
        this.adv_list = immutableCopyOf(builder.adv_list);
        this.has_more = builder.has_more;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public List<AdvInfo> adv_list;
        public List<GameInfo> game_list;
        public Integer has_more;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.game_list = DataRes.copyOf(dataRes.game_list);
                this.adv_list = DataRes.copyOf(dataRes.adv_list);
                this.has_more = dataRes.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
