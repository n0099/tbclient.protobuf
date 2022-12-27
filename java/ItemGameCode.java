package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ItemGameCode extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GameCodeList> game_code_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer unclaimed_num;
    public static final Integer DEFAULT_UNCLAIMED_NUM = 0;
    public static final List<GameCodeList> DEFAULT_GAME_CODE_LIST = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ItemGameCode> {
        public List<GameCodeList> game_code_list;
        public Integer unclaimed_num;

        public Builder() {
        }

        public Builder(ItemGameCode itemGameCode) {
            super(itemGameCode);
            if (itemGameCode == null) {
                return;
            }
            this.unclaimed_num = itemGameCode.unclaimed_num;
            this.game_code_list = Message.copyOf(itemGameCode.game_code_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemGameCode build(boolean z) {
            return new ItemGameCode(this, z);
        }
    }

    public ItemGameCode(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.unclaimed_num;
            if (num == null) {
                this.unclaimed_num = DEFAULT_UNCLAIMED_NUM;
            } else {
                this.unclaimed_num = num;
            }
            List<GameCodeList> list = builder.game_code_list;
            if (list == null) {
                this.game_code_list = DEFAULT_GAME_CODE_LIST;
                return;
            } else {
                this.game_code_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.unclaimed_num = builder.unclaimed_num;
        this.game_code_list = Message.immutableCopyOf(builder.game_code_list);
    }
}
