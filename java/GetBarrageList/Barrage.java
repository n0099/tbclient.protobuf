package tbclient.GetBarrageList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class Barrage extends Message {
    public static final String DEFAULT_COLOR = "";
    public static final String DEFAULT_CONTENT = "";
    public static final Long DEFAULT_USER_ID = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long user_id;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Barrage> {
        public String color;
        public String content;
        public Long user_id;

        public Builder() {
        }

        public Builder(Barrage barrage) {
            super(barrage);
            if (barrage == null) {
                return;
            }
            this.content = barrage.content;
            this.color = barrage.color;
            this.user_id = barrage.user_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Barrage build(boolean z) {
            return new Barrage(this, z);
        }
    }

    public Barrage(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            String str2 = builder.color;
            if (str2 == null) {
                this.color = "";
            } else {
                this.color = str2;
            }
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
                return;
            } else {
                this.user_id = l;
                return;
            }
        }
        this.content = builder.content;
        this.color = builder.color;
        this.user_id = builder.user_id;
    }
}
