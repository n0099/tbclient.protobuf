package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Manager extends Message {
    public static final Long DEFAULT_ID = 0L;
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    private Manager(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
                return;
            } else {
                this.name = builder.name;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Manager> {
        public Long id;
        public String name;

        public Builder() {
        }

        public Builder(Manager manager) {
            super(manager);
            if (manager != null) {
                this.id = manager.id;
                this.name = manager.name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Manager build(boolean z) {
            return new Manager(this, z);
        }
    }
}
