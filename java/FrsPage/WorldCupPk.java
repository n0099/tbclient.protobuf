package tbclient.FrsPage;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class WorldCupPk extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_PRIZE_URL = "";
    public static final String DEFAULT_SUM_BONUS = "";
    public static final String DEFAULT_SUM_GAME = "";
    public static final String DEFAULT_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String prize_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sum_bonus;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String sum_game;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<WorldCupPk> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String prize_url;
        public String sum_bonus;
        public String sum_game;
        public String url;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(WorldCupPk worldCupPk) {
            super(worldCupPk);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {worldCupPk};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (worldCupPk == null) {
                return;
            }
            this.sum_game = worldCupPk.sum_game;
            this.sum_bonus = worldCupPk.sum_bonus;
            this.prize_url = worldCupPk.prize_url;
            this.url = worldCupPk.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorldCupPk build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new WorldCupPk(this, z, null) : (WorldCupPk) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ WorldCupPk(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorldCupPk(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.sum_game;
            if (str == null) {
                this.sum_game = "";
            } else {
                this.sum_game = str;
            }
            String str2 = builder.sum_bonus;
            if (str2 == null) {
                this.sum_bonus = "";
            } else {
                this.sum_bonus = str2;
            }
            String str3 = builder.prize_url;
            if (str3 == null) {
                this.prize_url = "";
            } else {
                this.prize_url = str3;
            }
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
                return;
            } else {
                this.url = str4;
                return;
            }
        }
        this.sum_game = builder.sum_game;
        this.sum_bonus = builder.sum_bonus;
        this.prize_url = builder.prize_url;
        this.url = builder.url;
    }
}
