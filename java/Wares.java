package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Wares extends Message {
    public static final String DEFAULT_NEW_PROPS_ID = "";
    public static final String DEFAULT_WARS_ITEM = "";
    public static final String DEFAULT_WARS_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer money;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String new_props_id;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer props_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer props_mon;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String wars_item;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String wars_name;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_MONEY = 0;
    public static final Integer DEFAULT_PROPS_MON = 0;

    private Wares(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            if (builder.money == null) {
                this.money = DEFAULT_MONEY;
            } else {
                this.money = builder.money;
            }
            if (builder.props_mon == null) {
                this.props_mon = DEFAULT_PROPS_MON;
            } else {
                this.props_mon = builder.props_mon;
            }
            if (builder.wars_name == null) {
                this.wars_name = "";
            } else {
                this.wars_name = builder.wars_name;
            }
            if (builder.wars_item == null) {
                this.wars_item = "";
            } else {
                this.wars_item = builder.wars_item;
            }
            if (builder.new_props_id == null) {
                this.new_props_id = "";
                return;
            } else {
                this.new_props_id = builder.new_props_id;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.money = builder.money;
        this.props_mon = builder.props_mon;
        this.wars_name = builder.wars_name;
        this.wars_item = builder.wars_item;
        this.new_props_id = builder.new_props_id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Wares> {
        public Integer money;
        public String new_props_id;
        public Integer props_id;
        public Integer props_mon;
        public String wars_item;
        public String wars_name;

        public Builder() {
        }

        public Builder(Wares wares) {
            super(wares);
            if (wares != null) {
                this.props_id = wares.props_id;
                this.money = wares.money;
                this.props_mon = wares.props_mon;
                this.wars_name = wares.wars_name;
                this.wars_item = wares.wars_item;
                this.new_props_id = wares.new_props_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Wares build(boolean z) {
            return new Wares(this, z);
        }
    }
}
