package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class GameCodeList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_BEGIN_TIME;
    public static final Integer DEFAULT_CLAIMED_STATUS;
    public static final String DEFAULT_CLAIMED_VALUE = "";
    public static final Integer DEFAULT_END_TIME;
    public static final Integer DEFAULT_ITEM_ID;
    public static final String DEFAULT_LABEL = "";
    public static final Integer DEFAULT_LIST_ID;
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer begin_time;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer claimed_status;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String claimed_value;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer end_time;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer item_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String label;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer list_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GameCodeList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer begin_time;
        public Integer claimed_status;
        public String claimed_value;
        public Integer end_time;
        public Integer item_id;
        public String label;
        public Integer list_id;
        public Integer type;

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
        public Builder(GameCodeList gameCodeList) {
            super(gameCodeList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {gameCodeList};
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
            if (gameCodeList == null) {
                return;
            }
            this.list_id = gameCodeList.list_id;
            this.type = gameCodeList.type;
            this.label = gameCodeList.label;
            this.begin_time = gameCodeList.begin_time;
            this.end_time = gameCodeList.end_time;
            this.item_id = gameCodeList.item_id;
            this.claimed_status = gameCodeList.claimed_status;
            this.claimed_value = gameCodeList.claimed_value;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameCodeList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GameCodeList(this, z, null) : (GameCodeList) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1103640332, "Ltbclient/GameCodeList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1103640332, "Ltbclient/GameCodeList;");
                return;
            }
        }
        DEFAULT_LIST_ID = 0;
        DEFAULT_TYPE = 0;
        DEFAULT_BEGIN_TIME = 0;
        DEFAULT_END_TIME = 0;
        DEFAULT_ITEM_ID = 0;
        DEFAULT_CLAIMED_STATUS = 0;
    }

    public /* synthetic */ GameCodeList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCodeList(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder.list_id;
            if (num == null) {
                this.list_id = DEFAULT_LIST_ID;
            } else {
                this.list_id = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            String str = builder.label;
            if (str == null) {
                this.label = "";
            } else {
                this.label = str;
            }
            Integer num3 = builder.begin_time;
            if (num3 == null) {
                this.begin_time = DEFAULT_BEGIN_TIME;
            } else {
                this.begin_time = num3;
            }
            Integer num4 = builder.end_time;
            if (num4 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num4;
            }
            Integer num5 = builder.item_id;
            if (num5 == null) {
                this.item_id = DEFAULT_ITEM_ID;
            } else {
                this.item_id = num5;
            }
            Integer num6 = builder.claimed_status;
            if (num6 == null) {
                this.claimed_status = DEFAULT_CLAIMED_STATUS;
            } else {
                this.claimed_status = num6;
            }
            String str2 = builder.claimed_value;
            if (str2 == null) {
                this.claimed_value = "";
                return;
            } else {
                this.claimed_value = str2;
                return;
            }
        }
        this.list_id = builder.list_id;
        this.type = builder.type;
        this.label = builder.label;
        this.begin_time = builder.begin_time;
        this.end_time = builder.end_time;
        this.item_id = builder.item_id;
        this.claimed_status = builder.claimed_status;
        this.claimed_value = builder.claimed_value;
    }
}
