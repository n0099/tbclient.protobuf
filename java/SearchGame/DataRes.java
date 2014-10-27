package tbclient.SearchGame;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GameInfo> game_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer has_more;
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final List<GameInfo> DEFAULT_GAME_LIST = Collections.emptyList();

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.game_list == null) {
                this.game_list = DEFAULT_GAME_LIST;
                return;
            } else {
                this.game_list = immutableCopyOf(builder.game_list);
                return;
            }
        }
        this.has_more = builder.has_more;
        this.game_list = immutableCopyOf(builder.game_list);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public List<GameInfo> game_list;
        public Integer has_more;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.has_more = dataRes.has_more;
                this.game_list = DataRes.copyOf(dataRes.game_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
